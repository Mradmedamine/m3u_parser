package org.iptv.m3u;

import java.io.IOException;
import java.io.InputStream;

import org.iptv.m3u.data.MediaPlaylist;
import org.iptv.m3u.data.Playlist;

public class M3uParser extends BaseM3uParser {

	public M3uParser(InputStream inputStream, Encoding encoding) {
		super(inputStream, encoding);
	}

	@Override
	public Playlist parse() throws IOException, ParseException, PlaylistException {
		validateAvailable();

		final ParseState state = new ParseState(mEncoding);
		final TrackLineParser trackLineParser = new TrackLineParser();

		try {
			state.setMedia();

			while (mScanner.hasNext()) {
				final String line = mScanner.next().trim();

				if (line.length() == 0) {
					continue;
				} else {
					trackLineParser.parse(line, state);
				}
			}

			Playlist playlist = new Playlist.Builder()
			        .withMediaPlaylist(new MediaPlaylist.Builder().withTracks(state.getMedia().tracks).build()).build();

			PlaylistValidation validation = PlaylistValidation.from(playlist);

			if (validation.isValid()) {
				return playlist;
			} else {
				throw new PlaylistException(mScanner.getInput(), validation.getErrors());
			}
		} catch (ParseException exception) {
			exception.setInput(mScanner.getInput());
			throw exception;
		}
	}

	private boolean isComment(final String line) {
		return line.indexOf(Constants.COMMENT_PREFIX) == 0;
	}
}

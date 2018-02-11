package org.iptv.m3u;

import java.io.IOException;

import org.iptv.m3u.data.Playlist;

interface IPlaylistParser {
	Playlist parse() throws IOException, ParseException, PlaylistException;

	boolean isAvailable();
}

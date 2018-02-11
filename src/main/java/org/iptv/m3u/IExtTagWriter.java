package org.iptv.m3u;

import java.io.IOException;

import org.iptv.m3u.data.Playlist;

interface IExtTagWriter extends SectionWriter {
	String getTag();

	void write(TagWriter tagWriter, Playlist playlist) throws IOException, ParseException;
}

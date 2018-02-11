package org.iptv.m3u;

import java.io.IOException;

import org.iptv.m3u.data.Playlist;

interface SectionWriter {
    void write(TagWriter tagWriter, Playlist playlist) throws IOException, ParseException;
}

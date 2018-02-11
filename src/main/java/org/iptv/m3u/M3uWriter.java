package org.iptv.m3u;

import java.io.IOException;
import java.io.OutputStream;

import org.iptv.m3u.data.Playlist;

class M3uWriter extends Writer{

    M3uWriter(OutputStream outputStream, Encoding encoding) {
        super(outputStream, encoding);
    }

    @Override
    void doWrite(Playlist playlist) throws IOException {
        throw new UnsupportedOperationException();
    }
}

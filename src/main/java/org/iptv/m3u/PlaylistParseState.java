package org.iptv.m3u;

import java.util.List;

import org.iptv.m3u.data.StartData;

interface PlaylistParseState<T> extends IParseState<T> {
    PlaylistParseState<T> setUnknownTags(List<String> unknownTags);

    PlaylistParseState<T> setStartData(StartData startData);
}

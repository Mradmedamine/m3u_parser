package org.iptv.m3u;

interface IParseState<T> {
    T buildPlaylist() throws ParseException;
}

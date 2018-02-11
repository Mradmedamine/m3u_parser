package org.iptv.m3u;

interface IExtTagParser extends LineParser {
    String getTag();
    boolean hasData();
}

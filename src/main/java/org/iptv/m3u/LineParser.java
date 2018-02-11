package org.iptv.m3u;

interface LineParser {
    void parse(String line, ParseState state) throws ParseException;
}

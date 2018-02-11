package org.iptv.m3u;


interface AttributeParser<Builder> {
    void parse(Attribute attribute, Builder builder, ParseState state) throws ParseException;
}

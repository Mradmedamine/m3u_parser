package org.iptv.m3u;

interface AttributeWriter<T> {

    String write(T attributes) throws ParseException;

    boolean containsAttribute(T attributes);
}

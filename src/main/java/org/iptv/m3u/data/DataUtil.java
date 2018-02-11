package org.iptv.m3u.data;

import java.util.Collections;
import java.util.List;

class DataUtil {
    static <T> List<T> emptyOrUnmodifiable(final List<T> list) {
        return list == null ? Collections.<T>emptyList() : Collections.unmodifiableList(list);
    }
}

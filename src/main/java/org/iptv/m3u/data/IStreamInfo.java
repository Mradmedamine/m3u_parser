package org.iptv.m3u.data;

import java.util.List;

public interface IStreamInfo {
    public int getBandwidth();

    boolean hasAverageBandwidth();

    int getAverageBandwidth();

    boolean hasCodecs();

    List<String> getCodecs();

    boolean hasResolution();

    Resolution getResolution();

    boolean hasFrameRate();

    float getFrameRate();

    boolean hasVideo();

    String getVideo();
}

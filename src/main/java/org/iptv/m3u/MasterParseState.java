package org.iptv.m3u;

import java.util.ArrayList;
import java.util.List;

import org.iptv.m3u.data.IFrameStreamInfo;
import org.iptv.m3u.data.MasterPlaylist;
import org.iptv.m3u.data.MediaData;
import org.iptv.m3u.data.PlaylistData;
import org.iptv.m3u.data.StartData;
import org.iptv.m3u.data.StreamInfo;

class MasterParseState implements PlaylistParseState<MasterPlaylist> {
    private List<String> mUnknownTags;
    private StartData mStartData;

    public final List<PlaylistData> playlists = new ArrayList<>();
    public final List<IFrameStreamInfo> iFramePlaylists = new ArrayList<>();
    public final List<MediaData> mediaData = new ArrayList<>();

    public StreamInfo streamInfo;

    public boolean isDefault;
    public boolean isNotAutoSelect;

    public void clearMediaDataState() {
        isDefault = false;
        isNotAutoSelect = false;
    }

    @Override
    public PlaylistParseState<MasterPlaylist> setUnknownTags(final List<String> unknownTags) {
        mUnknownTags = unknownTags;
        return this;
    }

    @Override
    public PlaylistParseState<MasterPlaylist> setStartData(final StartData startData) {
        mStartData = startData;
        return this;
    }

    @Override
    public MasterPlaylist buildPlaylist() throws ParseException {
        return new MasterPlaylist.Builder()
                .withPlaylists(playlists)
                .withIFramePlaylists(iFramePlaylists)
                .withMediaData(mediaData)
                .withUnknownTags(mUnknownTags)
                .withStartData(mStartData)
                .build();
    }
}

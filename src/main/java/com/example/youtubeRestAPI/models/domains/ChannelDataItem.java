package com.example.youtubeRestAPI.models.domains;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ChannelDataItem {
    @JsonProperty("kind")
    private String kindChannelItem;

    @JsonProperty("id")
    private String channelId;

    public String getKindChannelItem() {
        return kindChannelItem;
    }

    public void setKindChannelItem(String kindChannelItem) {
        this.kindChannelItem = kindChannelItem;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    @Override
    public String toString() {
        return "ChannelDataItem{" +
                "kindChannelItem='" + kindChannelItem + '\'' +
                ", channelId='" + channelId + '\'' +
                '}';
    }
}

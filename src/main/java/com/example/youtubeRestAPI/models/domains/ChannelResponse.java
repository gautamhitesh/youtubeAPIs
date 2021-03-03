package com.example.youtubeRestAPI.models.domains;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ChannelResponse {

    @JsonProperty("etag")
    private String etag;

    @JsonProperty("pageInfo")
    private PageInfo pageInfo;

    @JsonProperty("item")
    private String channelDataList;

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public String getChannelDataList() {
        return channelDataList;
    }

    public void setChannelDataList(String channelDataList) {
        this.channelDataList = channelDataList;
    }

    @Override
    public String toString() {
        return "ChannelResponse{" +
                "etag='" + etag + '\'' +
                ", pageInfo=" + pageInfo.toString() +
                ", channelDataList=" + channelDataList +
                '}';
    }
}

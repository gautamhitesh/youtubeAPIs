package com.example.youtubeRestAPI.controllers;

import com.example.youtubeRestAPI.models.domains.ChannelResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ChannelData {
    @Autowired
    private RestTemplate restTemplate;

    private Logger logger= LogManager.getLogger(ChannelData.class);

    @GetMapping("/getChannelData")
    public ChannelResponse getChannelData(@RequestParam String channelId){
//        String API_KEY="AIzaSyCd7MFJDokplz0xIALn9LgPuwez5mdT-AY";
        String API_KEY="AIzaSyCBvG-E1YNA6t-ZOcDoAACP9D9P43vF80E";
        String url="https://www.googleapis.com/youtube/v3/channels?part=contentDetails&id="+channelId+"&key="+API_KEY;
        HttpHeaders httpHeaders=new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<ChannelResponse> entity=new HttpEntity<>(httpHeaders);
        ResponseEntity<ChannelResponse> response=null;
        response= restTemplate.exchange(url,HttpMethod.GET,entity,ChannelResponse.class);
        System.out.println(response.getBody().toString());
        return response.getBody();
    }
}

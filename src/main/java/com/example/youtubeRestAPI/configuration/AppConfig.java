package com.example.youtubeRestAPI.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig extends RestTemplate {
//    private int connectionTimeOut=15;
//    private int readTimeOut=10;
//
//    @Bean
//    RestTemplate restTemplate(){
//        HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory();
//        clientHttpRequestFactory.setConnectTimeout(connectionTimeOut);
//        clientHttpRequestFactory.setConnectionRequestTimeout(connectionTimeOut);
//        clientHttpRequestFactory.setReadTimeout(readTimeOut);
//        ClientHttpRequestFactory factory = new BufferingClientHttpRequestFactory(clientHttpRequestFactory);
//        RestTemplate restTemplate = new RestTemplate(factory);
//        MappingJackson2HttpMessageConverter jsonMessageConverter = new MappingJackson2HttpMessageConverter();
//        jsonMessageConverter.setObjectMapper(jacksonObjectMapper());
//        List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
//        messageConverters.add(jsonMessageConverter);
//        restTemplate().setMessageConverters(messageConverters);
//        return restTemplate;
//    }
//
//    @Bean
//    public ObjectMapper jacksonObjectMapper() {
//        return new ObjectMapper().setPropertyNamingStrategy(propertyNamingStrategy());
//    }
//    @Bean
//    public PropertyNamingStrategy propertyNamingStrategy() {
//        return new PropertyNamingStrategy.UpperCamelCaseStrategy();
//    }

}

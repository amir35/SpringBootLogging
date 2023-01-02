package com.example.demo.controller;

import org.springframework.http.MediaType;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestTemplateController {


    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getData")
    public String getDataFromApi() {
        //HttpHeaders headers = new HttpHeaders();
        //headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        //HttpEntity <String> entity = new HttpEntity<String>(headers);

        //System.out.println(entity);

        return restTemplate.getForEntity("http://localhost:8083/customer", String.class).getBody();

        //return getRestTemplate().exchange("http://localhost:8083/customer", HttpMethod.GET, entity, String.class).getBody();
        //return restTemplate.exchange("http://localhost:8083/customer", HttpMethod.GET, entity, String.class).getBody();
    }


}

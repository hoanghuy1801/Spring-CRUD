package com.example.servicecrud.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import com.example.servicecrud.entity.ChuyenBay;

import java.util.Arrays;


@RestController
public class Controller {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/template/chuyenbays")
    public String getList() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        return restTemplate.exchange("http://localhost:8080/api/chuyenbays", HttpMethod.GET, entity, String.class).getBody();
    }

    @RequestMapping(value = "/template/chuyenbays", method = RequestMethod.POST)
    public String createProducts(@RequestBody ChuyenBay chuyenbay) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<ChuyenBay> entity = new HttpEntity<ChuyenBay>(chuyenbay,headers);

        return restTemplate.exchange("http://localhost:8080/api/chuyenbays", HttpMethod.POST, entity, String.class).getBody();
    }

    @RequestMapping(value = "/template/chuyenbays/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") String id) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<ChuyenBay> entity = new HttpEntity<ChuyenBay>(headers);

        return restTemplate.exchange("http://localhost:8080/api/chuyenbays/"+id, HttpMethod.DELETE, entity, String.class).getBody();
    }


    @RequestMapping(value = "/template/chuyenbays", method = RequestMethod.PUT)
    public String update(@RequestBody ChuyenBay student) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<ChuyenBay> entity = new HttpEntity<ChuyenBay>(student,headers);

        return restTemplate.exchange("http://localhost:8080/api/chuyenbays", HttpMethod.PUT, entity, String.class).getBody();
    }

}

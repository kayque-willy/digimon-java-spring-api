package com.api.digimon.service;

import com.api.digimon.models.Digimon;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import lombok.AllArgsConstructor;

// O @Service e o @Repositório prcixam implementar intefaces
@Service
// @AllArgsConstructor
public class DigimonService implements DigimonServiceInt {

    private final RestTemplate restTemplate;
    private String url = "https://digimon-api.vercel.app/api/digimon";

    public DigimonService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public Digimon[] findAllDigimons() {
        return this.restTemplate.getForObject(url, Digimon[].class);
    }

    @Override
    public Digimon[] findDigimonByLevel(String level) {
        return this.restTemplate.getForObject(url + "/level/" + level, Digimon[].class);
    }

    @Override
    public Digimon[] findDigimonByName(String name) {
        return this.restTemplate.getForObject(url + "/name/" + name, Digimon[].class);
    }

    // @Override
    // public Digimon saveDigimon(Digimon digimon) {
    // }

    // @Override
    // public Digimon updateDigimon(Digimon digimon) {
    // }

    // @Override
    // public void deleteDigimon(Digimon digimon) {
    // }
}

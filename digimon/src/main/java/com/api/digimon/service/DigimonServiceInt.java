package com.api.digimon.service;

import java.util.List;

import com.api.digimon.models.Digimon;

public interface DigimonServiceInt {

    public Digimon[] findAllDigimons();

    public Digimon[] findDigimonByLevel(String level);

    public Digimon[] findDigimonByName(String name);

    // public Digimon saveDigimon(Digimon digimon);

    // public Digimon updateDigimon(Digimon digimon);

    // public void deleteDigimon(Digimon digimon);

}

package com.shasha.msksmanufacturer.services;

import com.shasha.msksmanufacturer.web.model.v2.ChocolateDtoV2;

import java.util.UUID;

/**
 * Created by kobis on 28 May, 2020
 */
public interface ChocolateServiceV2 {
    ChocolateDtoV2 getChocolateByID(UUID chocolateID);

    ChocolateDtoV2 saveNewChocolate(ChocolateDtoV2 chocolateDto);

    void updateChocolate(UUID chocolateID, ChocolateDtoV2 chocolateDto);

    void deleteById(UUID chocolateID);
}
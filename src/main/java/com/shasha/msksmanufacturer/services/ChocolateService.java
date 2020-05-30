package com.shasha.msksmanufacturer.services;

import com.shasha.msksmanufacturer.web.model.ChocolateDto;

import java.util.UUID;

/**
 * Created by kobis on 27 May, 2020
 */
public interface ChocolateService {
    ChocolateDto getChocolateByID(UUID chocolateID);

    ChocolateDto saveNewChocolate(ChocolateDto chocolateDto);

    void updateChocolate(UUID chocolateID, ChocolateDto chocolateDto);

    void deleteById(UUID chocolateID);
}

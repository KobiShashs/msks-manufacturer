package com.shasha.msksmanufacturer.services;

import com.shasha.msksmanufacturer.web.model.v2.ChocolateDtoV2;
import com.shasha.msksmanufacturer.web.model.v2.ChocolateType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by kobis on 28 May, 2020
 */
@Slf4j
@Service
public class ChocolateServiceV2Impl implements ChocolateServiceV2 {
    @Override
    public ChocolateDtoV2 getChocolateByID(UUID chocolateID) {
        return ChocolateDtoV2.builder()
                .id(UUID.randomUUID())
                .chocolateName("Pikkolo")
                .chocolateType(ChocolateType.MILK)
                .chocolateSlogan("Crispy pleasure for small gourmets")
                .build();
    }

    @Override
    public ChocolateDtoV2 saveNewChocolate(ChocolateDtoV2 chocolateDto) {
        return ChocolateDtoV2.builder()
                .id(UUID.randomUUID())
                .chocolateName("Pikkolo")
                .chocolateType(ChocolateType.MILK)
                .chocolateSlogan("Crispy pleasure for small gourmets")
                .build();
    }

    @Override
    public void updateChocolate(UUID chocolateID, ChocolateDtoV2 chocolateDto) {
        log.debug("Allegedly updating the record");
    }

    @Override
    public void deleteById(UUID chocolateID) {
        log.debug("Allegedly deleting the record");
    }
}

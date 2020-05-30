package com.shasha.msksmanufacturer.services;

import com.shasha.msksmanufacturer.web.model.ChocolateDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.UUID;

/**
 * Created by kobis on 27 May, 2020
 */
@Slf4j
@Service
public class ChocolateServiceImpl implements ChocolateService {
    @Override
    public ChocolateDto getChocolateByID(UUID chocolateID) {
        return ChocolateDto.builder()
                .id(UUID.randomUUID())
                .chocolateName("Pikkolo")
                .chocolateType("Milk")
                .chocolateSlogan("Crispy pleasure for small gourmets")
                .build();
    }

    @Override
    public ChocolateDto saveNewChocolate(@RequestBody ChocolateDto chocolateDto) {
        return ChocolateDto.builder()
                .id(UUID.randomUUID())
                .chocolateName("Pikkolo")
                .chocolateType("Milk")
                .chocolateSlogan("Crispy pleasure for small gourmets")
                .build();
    }

    @Override
    public void updateChocolate(UUID chocolateID, @RequestBody ChocolateDto chocolateDto) {
        log.debug("Allegedly updating the record");
    }

    @Override
    public void deleteById(UUID chocolateID) {
        log.debug("Allegedly deleting the record");
    }
}

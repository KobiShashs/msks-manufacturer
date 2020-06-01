package com.shasha.msksmanufacturer.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shasha.msksmanufacturer.services.ChocolateServiceV2;
import com.shasha.msksmanufacturer.web.controller.v2.ChocolateControllerV2;
import com.shasha.msksmanufacturer.web.model.v2.ChocolateDtoV2;
import com.shasha.msksmanufacturer.web.model.v2.ChocolateType;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.UUID;

import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Created by kobis on 29 May, 2020
 */
@RunWith(SpringRunner.class)
@WebMvcTest(ChocolateControllerV2.class)
public class ChocolateControllerTest {

    @MockBean
    ChocolateServiceV2 chocolateServiceV2;

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    private ChocolateDtoV2 validDto;

    private ChocolateDtoV2 validDtoWithNull;

    @Before
    public void setUp() throws Exception {
        validDto = ChocolateDtoV2.builder()
                .id(UUID.randomUUID())
                .chocolateName("Pikkolo")
                .chocolateType(ChocolateType.MILK)
                .chocolateSlogan("Crispy pleasure for small gourmets")
                .upc(123456789L)
                .build();

        validDtoWithNull = ChocolateDtoV2.builder()
                .chocolateName("Pikkolo")
                .chocolateType(ChocolateType.MILK)
                .chocolateSlogan("Crispy pleasure for small gourmets")
                .upc(123456789L)
                .build();


    }

    @Test
    public void getItem() throws Exception {

        given(chocolateServiceV2.getChocolateByID(any(UUID.class))).willReturn(validDto);

        mockMvc.perform(get("/api/v2/chocolate/" + validDto.getId().toString()).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.id", is(validDto.getId().toString())))
                .andExpect(jsonPath("$.chocolateName", is(validDto.getChocolateName())))
                .andExpect(jsonPath("$.chocolateType", is(validDto.getChocolateType().toString())))
                .andExpect(jsonPath("$.chocolateSlogan", is(validDto.getChocolateSlogan())))
                .andExpect(jsonPath("$.upc", is(validDto.getUpc().intValue())));
    }

    @Test
    public void addItem() throws Exception {

        String chocolateDtoJson = objectMapper.writeValueAsString(validDtoWithNull);

        given(chocolateServiceV2.saveNewChocolate(any())).willReturn(validDto);

        mockMvc.perform(post("/api/v2/chocolate")
                .contentType(MediaType.APPLICATION_JSON)
                .content(chocolateDtoJson))
                .andExpect(status().isCreated());


    }

    @Test
    public void updateItem() throws Exception {

        String chocolateDtoJson = objectMapper.writeValueAsString(validDtoWithNull);

        mockMvc.perform(put("/api/v2/chocolate/" + validDto.getId())
                .contentType(MediaType.APPLICATION_JSON)
                .content(chocolateDtoJson))
                .andExpect(status().isNoContent());
    }

    @Test
    public void deleteItem() throws Exception {

        String chocolateDtoJson = objectMapper.writeValueAsString(validDto);

        mockMvc.perform(delete("/api/v2/chocolate/" + validDto.getId())
                .contentType(MediaType.APPLICATION_JSON)
                .content((byte[]) null))
                .andExpect(status().isNoContent());
    }
}
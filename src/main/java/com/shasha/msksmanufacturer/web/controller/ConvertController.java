package com.shasha.msksmanufacturer.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kobis on 27 May, 2020
 */

@RequestMapping("/api/v1/numbers")
@RestController
public class ConvertController {

    @GetMapping("convert/{value}")
    public int doTheThing(@PathVariable String value) {
        return Integer.parseInt(value);
    }
}

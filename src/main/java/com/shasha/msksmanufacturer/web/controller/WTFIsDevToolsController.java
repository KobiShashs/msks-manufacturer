package com.shasha.msksmanufacturer.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kobis on 27 May, 2020
 */
@RequestMapping("dev-tools")
@RestController
public class WTFIsDevToolsController {

    @GetMapping("/try")
    ResponseEntity<String> getSomeText() {
        System.out.println("Added");
        return new ResponseEntity<>("Moshe", HttpStatus.OK);
    }
}

package com.shasha.msksmanufacturer.web.controller;

import com.shasha.msksmanufacturer.web.model.ChocolateDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * Created by kobis on 28 May, 2020
 */

@RequestMapping("api/v1/stam")
@RestController
public class StamController {


    @RequestMapping(value = "/greet", method = RequestMethod.GET)
//    @CrossOrigin
    public String greet(@RequestParam(value = "name", defaultValue = "No One") String name) {
        return "Hello " + name + " !!!";
    }

    @PostMapping("/add")
    public ResponseEntity<String> addNewItem(@RequestBody ChocolateDto chocolateDto) {
        return new ResponseEntity<>("DONE", HttpStatus.CREATED);
    }

    @PutMapping("/update/{chocolateID}")
    public ResponseEntity<String> updateItemById(@PathVariable("chocolateID") UUID chocolateID,
                                                 @RequestBody ChocolateDto chocolateDto) {
        return new ResponseEntity<>("UPDATED", HttpStatus.OK);
    }


    @DeleteMapping("/delete/{chocolateID}")
    public ResponseEntity<String> deleteItemById(@PathVariable("chocolateID") UUID chocolateID) {
        return new ResponseEntity<>("DELETED", HttpStatus.OK);
    }
}

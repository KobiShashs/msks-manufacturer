package com.shasha.msksmanufacturer.web.controller.v2;


import com.shasha.msksmanufacturer.services.ChocolateServiceV2;
import com.shasha.msksmanufacturer.web.model.v2.ChocolateDtoV2;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

/**
 * Created by kobis on 28 May, 2020
 */

@Validated
@RequestMapping("/api/v2/chocolate")
@RestController
public class ChocolateControllerV2 {

    private final ChocolateServiceV2 chocolateServiceV2;

    //You can remove this CTOR Injection by using @RequiredArgsConstructor in the Controller class level
    public ChocolateControllerV2(ChocolateServiceV2 chocolateServiceV2) {
        this.chocolateServiceV2 = chocolateServiceV2;
    }

    @GetMapping({"/{chocolateID}"})
    public ResponseEntity<ChocolateDtoV2> getItem(@PathVariable("chocolateID") UUID chocolateID) {
        //return new ResponseEntity<>(ChocolateDto.builder().build(), HttpStatus.OK);
        return new ResponseEntity<>(chocolateServiceV2.getChocolateByID(chocolateID), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity addItem(@Valid @RequestBody ChocolateDtoV2 chocolateDto) {
        // ChocolateDtoV2 savedDto = chocolateServiceV2.saveNewChocolate(chocolateDto);
        var savedDto = chocolateServiceV2.saveNewChocolate(chocolateDto);

        //  HttpHeaders headers = new HttpHeaders();
        var headers = new HttpHeaders();
        headers.add("Location", "/api/v1/chocolate/" + savedDto.getId().toString());

        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping({"/{chocolateID}"})
    public ResponseEntity updateItem(@PathVariable("chocolateID") UUID chocolateID, @Valid @RequestBody ChocolateDtoV2 chocolateDto) {

        chocolateServiceV2.updateChocolate(chocolateID, chocolateDto);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{chocolateID}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteItem(@PathVariable("chocolateID") UUID chocolateID) {
        chocolateServiceV2.deleteById(chocolateID);
    }

//    @ExceptionHandler(ConstraintViolationException.class)
//    public ResponseEntity<List>validationErrorHandler(ConstraintViolationException e){
//        List<String> errors = new ArrayList<>(e.getConstraintViolations().size());
//        e.getConstraintViolations().forEach(constraintViolation -> {
//            errors.add(constraintViolation.getPropertyPath()+" : " + constraintViolation.getMessage());
//        });
//
//        return new ResponseEntity<>(errors,HttpStatus.BAD_REQUEST);
//    }


}

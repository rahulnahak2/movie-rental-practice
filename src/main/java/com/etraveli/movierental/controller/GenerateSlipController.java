package com.etraveli.movierental.controller;

import com.etraveli.movierental.entities.CustomerDetails;
import com.etraveli.movierental.models.CustomerRequest;
import com.etraveli.movierental.services.RentalInfo;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movie-rental")
public class GenerateSlipController {
    @Autowired
    private RentalInfo rentalInfo;

    @PostMapping ("/generate-slip")
    public ResponseEntity<String> getMovieRentalSlip(@Valid @RequestBody CustomerRequest customerDetails){
        return ResponseEntity.ok(rentalInfo.statement(customerDetails));
    }

}

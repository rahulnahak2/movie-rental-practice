package com.etraveli.movierental.controller;

import com.etraveli.movierental.models.CustomerDetails;
import com.etraveli.movierental.services.RentalInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movie-rental")
public class GenerateSlipController {
    @Autowired
    private RentalInfo rentalInfo;

    @PostMapping ("/generate-slip")
    public String getMovieRentalSlip(@RequestBody CustomerDetails customerDetails){
        return  rentalInfo.statement(customerDetails);
    }

}

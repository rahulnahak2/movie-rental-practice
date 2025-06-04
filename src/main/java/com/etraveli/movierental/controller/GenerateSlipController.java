package com.etraveli.movierental.controller;


import com.etraveli.movierental.models.CustomerDetails;
import com.etraveli.movierental.services.RentalInfo;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movie-rental")
public class GenerateSlipController {
    @PostMapping ("/generate-slip")
    public String getMovieRentalSlip(@RequestBody CustomerDetails customerDetails){
        return new RentalInfo().statement(customerDetails);
    }

}

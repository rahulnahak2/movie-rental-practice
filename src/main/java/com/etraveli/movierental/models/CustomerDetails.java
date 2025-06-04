package com.etraveli.movierental.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@NoArgsConstructor
@Data
public class CustomerDetails {
    private String name;
    private List<MovieRental> rentals;
}

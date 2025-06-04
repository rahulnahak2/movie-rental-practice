package com.etraveli.movierental.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MovieRental {
    private String movieId;
    private int days;
}

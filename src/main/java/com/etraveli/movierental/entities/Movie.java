package com.etraveli.movierental.entities;

import com.etraveli.movierental.services.enums.MovieType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {
    @Id
    private String id;
    private String title;
    @Enumerated(EnumType.STRING)
    private MovieType code;
}

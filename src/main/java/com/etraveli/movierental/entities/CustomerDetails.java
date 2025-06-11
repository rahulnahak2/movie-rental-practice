package com.etraveli.movierental.entities;

import jakarta.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.List;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerDetails {
    @Id
    private String id;
    private String name;
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<MovieRental> rentals;
}

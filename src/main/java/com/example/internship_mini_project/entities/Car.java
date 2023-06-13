package com.example.internship_mini_project.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCar;
    private String model;
    private int horsePower;
    private String color;
    @Temporal(TemporalType.DATE)
    private Date yearOfManufacture;

}

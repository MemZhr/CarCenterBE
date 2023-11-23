package com.example.carservicecenter.model;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import lombok.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)

@NoArgsConstructor
@Getter
@Setter

@AllArgsConstructor

public abstract class Vehicle {
    @Id
    @NotEmpty
    private String vin;
    @NotEmpty
    private String make;
    @NotEmpty
    private String name;
    private Integer year;
    @NotEmpty
    private String color;
    @Enumerated(EnumType.STRING)
    private ServiceStatus status;
    @ManyToOne()
    @JoinColumn(name = "owner_id")
    private Owner owner;

}

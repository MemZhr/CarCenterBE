package com.example.carservicecenter.model;

import jakarta.persistence.Entity;

import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.*;

import lombok.*;

@Entity
@PrimaryKeyJoinColumn(name = "vin")
@Getter
@Setter
@NoArgsConstructor


public class Sedan extends Vehicle {
    public Sedan(String vin, String make, String name, Integer year, String color, ServiceStatus status, Owner owner) {
        super(vin, make, name, year, color, status, owner);
    }


}

package com.example.carservicecenter.dto;


import jakarta.validation.constraints.NotEmpty;

public class CarCenterNameDTO {
    @NotEmpty
    private String name;


    public String getName() {
        return name;
    }
}

package com.example.carservicecenter.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;



@Getter
public class OwnerNameDto {

    @NotEmpty
    private String name;
}

package com.example.carservicecenter.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString

public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer ownerId;
    @NotEmpty
    private String name;

@ManyToOne
@JoinColumn(name = "CenterId")
private CarCenter carCenter;

    public Owner(Integer ownerId, String name) {
        this.ownerId = ownerId;
        this.name = name;
        this.carCenter = carCenter;
    }




}

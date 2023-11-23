package com.example.carservicecenter.controller.interfaces;

import com.example.carservicecenter.model.CarCenter;
import com.example.carservicecenter.model.Owner;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public interface IOwnerController {
    public List<Owner> getAllOwners();

    public Owner findOwnerById(Integer ownerId);

    public Object findCarCenterByOwnerId(Integer ownerId);
    public void deleteOwner( Integer ownerId);


    }

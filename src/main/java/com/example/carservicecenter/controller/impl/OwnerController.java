package com.example.carservicecenter.controller.impl;

import com.example.carservicecenter.dto.OwnerNameDto;
import com.example.carservicecenter.controller.interfaces.IOwnerController;
import com.example.carservicecenter.model.Owner;
import com.example.carservicecenter.repository.CarCenterRepository;
import com.example.carservicecenter.repository.OwnerRepository;
import com.example.carservicecenter.service.interfaces.IOwnerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api")
public class OwnerController implements IOwnerController {

    @Autowired
    OwnerRepository ownerRepository;
    @Autowired
    CarCenterRepository carCenterRepository;
@Autowired
    IOwnerService ownerService;


// ********************** GET **********************

    @GetMapping("/owners")
    public List<Owner> getAllOwners() {
        return ownerRepository.findAll();
    }

    @GetMapping("owners/{ownerId}")
    public Owner findOwnerById(@PathVariable Integer ownerId) {
        return ownerService.findOwnerById(ownerId);

    }

    @GetMapping("/owners/carCenter/{ownerId}")
    public Object findCarCenterByOwnerId(@PathVariable Integer ownerId) {
       return ownerService.findCarCenterByOwnerId(ownerId);
    }

    // ********************** POST **********************

    @PostMapping("/owners")
    @ResponseStatus(HttpStatus.CREATED)
    public void addOwner(@RequestBody @Valid Owner owner){
        ownerRepository.save(owner);
    }

    // ********************** PUT **********************
@PutMapping("/owners/{ownerId}")
    public void updateOwner(@RequestBody @Valid Owner owner, @PathVariable  Integer ownerId){
        ownerService.updateOwner(owner,ownerId);
}

// ********************** PATCH **********************
@PatchMapping("/owners/name/{ownerId}")
    public void updateOwnerName(@RequestBody @Valid OwnerNameDto ownerNameDto,@PathVariable Integer ownerId){
        ownerService.updateOwnerName(ownerNameDto.getName(),ownerId);
}

// ********************** DELETE **********************
@DeleteMapping("/owners/{ownerId}")
    public void deleteOwner(@PathVariable Integer ownerId){
        ownerService.deleteOwnerById(ownerId);
}


}
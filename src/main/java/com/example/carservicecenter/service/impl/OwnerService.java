package com.example.carservicecenter.service.impl;

import com.example.carservicecenter.model.Owner;
import com.example.carservicecenter.repository.OwnerRepository;
import com.example.carservicecenter.service.interfaces.IOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Service
public class OwnerService  implements IOwnerService {
    @Autowired
    OwnerRepository ownerRepository;


    public Owner findOwnerById( Integer ownerId) {
        Optional<Owner> ownerOptional = ownerRepository.findById(ownerId);
        if (ownerOptional.isEmpty()) return null;
        return ownerOptional.get();

    }

    public Object findCarCenterByOwnerId(Integer ownerId) {
        Optional<Owner> ownerOptional = ownerRepository.findById(ownerId);
        if (ownerOptional.isEmpty()) return null;
        return ownerOptional.get().getCarCenter();
    }

    public void updateOwner(Owner owner, Integer ownerId) {
        Optional<Owner>optionalOwner=ownerRepository.findById(ownerId);
        if(optionalOwner.isEmpty())return;
        owner.setOwnerId(ownerId);
        ownerRepository.save(owner);

    }

    public void updateOwnerName(String name, Integer ownerId) {
        Optional<Owner>optionalOwner=ownerRepository.findById(ownerId);
        if(optionalOwner.isEmpty())return;
        Owner owner= optionalOwner.get();
        owner.setName(name);
        ownerRepository.save(owner);
    }

    public void deleteOwnerById(Integer ownerId) {
        Optional<Owner>optionalOwner=ownerRepository.findById(ownerId);
        if(optionalOwner.isEmpty())return;
        ownerRepository.deleteById(ownerId);
    }
}

package com.example.carservicecenter.service.impl;

import com.example.carservicecenter.model.Owner;
import com.example.carservicecenter.model.Sedan;
import com.example.carservicecenter.repository.OwnerRepository;
import com.example.carservicecenter.repository.SedanRepository;
import com.example.carservicecenter.service.interfaces.ISedanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Service
public class SedanService implements ISedanService {
@Autowired
    SedanRepository sedanRepository;
@Autowired
    OwnerRepository ownerRepository;


    public Sedan getSedanById( String vin){
        Optional<Sedan> sedanOptional= sedanRepository.findById(vin);
        if (sedanOptional.isEmpty()) return null;
        return sedanOptional.get();
    }

    public void transferCar(Integer ownerId, String vin) {
        Optional<Sedan> sedanOptional=sedanRepository.findById(vin);
        Optional<Owner> ownerOptional=ownerRepository.findById(ownerId);
        if (sedanOptional.isEmpty()) return;
        Sedan sedan=sedanOptional.get();
        sedan.setOwner(ownerOptional.get());
        sedanRepository.save(sedan);
    }
}

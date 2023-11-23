package com.example.carservicecenter.service.interfaces;

import com.example.carservicecenter.model.Sedan;

public interface ISedanService {

    public Sedan getSedanById(String vin);

    void transferCar(Integer ownerId, String vin);
}

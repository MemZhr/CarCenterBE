package com.example.carservicecenter.service.impl;

import com.example.carservicecenter.model.CarCenter;
import com.example.carservicecenter.repository.CarCenterRepository;
import com.example.carservicecenter.service.interfaces.ICarCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Service
public class CarCenterService implements ICarCenterService {


@Autowired
    CarCenterRepository carCenterRepository;

    public CarCenter getCarServicesCenterById(Integer centerId) {
        Optional<CarCenter> carServicesCenterOptional = carCenterRepository.findById(centerId);
        if(carServicesCenterOptional.isEmpty())return null;
        return carServicesCenterOptional.get();



    }


    public void updateCenter(CarCenter carCenter, Integer centerId) {
        Optional<CarCenter> carServicesCenterOptional = carCenterRepository.findById(centerId);
if(carServicesCenterOptional.isEmpty()) return;
carCenter.setCenterId(centerId);
carCenterRepository.save(carCenter);


    }


    public void updateCenterName(String name, Integer centerId) {
        Optional<CarCenter> carServicesCenterOptional = carCenterRepository.findById(centerId);
        if(carServicesCenterOptional.isEmpty()) return;
CarCenter carCenter = carServicesCenterOptional.get();
carCenter.setName(name);
carCenterRepository.save(carCenter);
    }

    public void deleteById(Integer centerId) {
        Optional<CarCenter> carServicesCenterOptional = carCenterRepository.findById(centerId);
        if(carServicesCenterOptional.isEmpty()) return;
carCenterRepository.deleteById(centerId);
    }
}

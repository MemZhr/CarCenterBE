package com.example.carservicecenter.service.interfaces;

import com.example.carservicecenter.model.CarCenter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface ICarCenterService {
    public CarCenter getCarServicesCenterById(Integer centerId);

    public void updateCenter(CarCenter carCenter, Integer centerId);

    void updateCenterName(String name, Integer centerId);

    void deleteById(Integer centerId);
}


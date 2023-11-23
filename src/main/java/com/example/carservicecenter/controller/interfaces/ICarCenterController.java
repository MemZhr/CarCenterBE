package com.example.carservicecenter.controller.interfaces;

import com.example.carservicecenter.model.CarCenter;

import java.util.List;

public interface ICarCenterController {

    public List<CarCenter> getAllCenters();
    public CarCenter getCarServicesCenterById(Integer centerId);
}

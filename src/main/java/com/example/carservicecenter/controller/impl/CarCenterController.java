package com.example.carservicecenter.controller.impl;

import com.example.carservicecenter.dto.CarCenterNameDTO;
import com.example.carservicecenter.controller.interfaces.ICarCenterController;
import com.example.carservicecenter.model.CarCenter;
import com.example.carservicecenter.repository.CarCenterRepository;
import com.example.carservicecenter.repository.OwnerRepository;
import com.example.carservicecenter.service.interfaces.ICarCenterService;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api")
public class CarCenterController implements ICarCenterController {
@Autowired

CarCenterRepository carCenterRepository;
@Autowired
    OwnerRepository ownerRepository;

@Autowired
    ICarCenterService carCenterService;



// ********************** GET **********************

@GetMapping("/centers")
    public List<CarCenter> getAllCenters(){
    return carCenterRepository.findAll();


    }

    @GetMapping("/centers/{centerId}")
    public CarCenter getCarServicesCenterById(@PathVariable Integer centerId) {
     return carCenterService.getCarServicesCenterById(centerId);
    }


// ********************** POST **********************

@PostMapping("/centers")
@ResponseStatus(HttpStatus.CREATED)
    public void addNewCenter(@RequestBody @Valid CarCenter carCenter){
carCenterRepository.save(carCenter);
}

// ********************** PUT **********************
@PutMapping("/centers/{centerId}")
@ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCenter(@RequestBody @Valid CarCenter carCenter, @PathVariable Integer centerId){
carCenterService.updateCenter(carCenter,centerId);

}
// ********************** PATCH **********************

    @PatchMapping("/centers/name/{centerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCenterName(@RequestBody @Valid CarCenterNameDTO centerNameDTO,@PathVariable Integer centerId){
    carCenterService.updateCenterName(centerNameDTO.getName(),centerId);

    }

// ********************** DELETE **********************
 @DeleteMapping("/centers/{centerId}")
 @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCenterbyId(@PathVariable Integer centerId){
    carCenterService.deleteById(centerId);

 }



}

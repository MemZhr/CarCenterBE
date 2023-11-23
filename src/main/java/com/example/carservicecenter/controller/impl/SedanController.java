package com.example.carservicecenter.controller.impl;


import com.example.carservicecenter.dto.SedanOwnerDTO;
import com.example.carservicecenter.controller.interfaces.ISedanController;
import com.example.carservicecenter.model.Sedan;
import com.example.carservicecenter.repository.SedanRepository;
import com.example.carservicecenter.service.interfaces.ISedanService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api")
public class SedanController implements ISedanController {

    @Autowired
    SedanRepository sedanRepository;

    @Autowired
    ISedanService sedanService;

    // ********************** GET **********************


    @GetMapping("/sedan")
    public List<Sedan> getAllSedans(){
        return sedanRepository.findAll();
    }
    @GetMapping("/sedan/{vin}")
    public Sedan getSedanById(@PathVariable String vin){
       return sedanService.getSedanById(vin);
    }

// ********************** PATCH **********************

    @PatchMapping("/sedan/transfer/{vin}")
    public void transferCar(@RequestBody @Valid SedanOwnerDTO sedanOwnerDTO, @PathVariable @NotNull String vin){
        sedanService.transferCar(sedanOwnerDTO.getOwnerId(),vin);

    }

}

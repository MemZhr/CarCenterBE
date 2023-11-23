package com.example.carservicecenter.controller.interfaces;

import com.example.carservicecenter.model.Sedan;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface ISedanController {
    public List<Sedan> getAllSedans();
    public Sedan getSedanById( String vin);
}

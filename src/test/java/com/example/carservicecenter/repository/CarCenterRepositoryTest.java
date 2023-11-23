package com.example.carservicecenter.repository;

import com.example.carservicecenter.model.CarCenter;
import com.example.carservicecenter.model.Owner;
import com.example.carservicecenter.model.Sedan;
import com.example.carservicecenter.model.ServiceStatus;
import jakarta.validation.constraints.AssertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CarCenterRepositoryTest {
private CarCenter carCenter;
private Owner owner;
private Sedan mazda;


    @Autowired
    CarCenterRepository carCenterRepository;
    @Autowired
    OwnerRepository ownerRepository;
    @Autowired
    SedanRepository sedanRepository;
    @BeforeEach
    void setUp() {
carCenter = new CarCenter(1,"RustBros","Rust Valley");
Owner owner1 = new Owner(2,"ahmed");
Sedan nissan= new Sedan("VM123","Nissan","centra",2023,"black", ServiceStatus.Ready,owner);

carCenterRepository.save(carCenter);
ownerRepository.save(owner1);
sedanRepository.save(nissan);

    }
@Test
    public void getCarCenterFromOwner(){
    Owner owner2 = new Owner(1,"MemZh");
    Sedan mazda = new Sedan("BM111","MAZDA","MAZDA6",2023,"GRAT",ServiceStatus.Ready,null);
    owner2.setCarCenter(carCenter);
    ownerRepository.save(owner2);
    sedanRepository.save(mazda);

    System.out.println(owner2);
    System.out.println(owner2.getCarCenter());



}

}
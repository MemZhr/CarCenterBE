package com.example.carservicecenter.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;


import java.util.Scanner;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class CarCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer CenterId;
    @NotEmpty
    private String name;
    @NotEmpty
    private String Address;


    public CarCenter(Integer centerId, String name, String address) {
        CenterId = centerId;
        this.name = name;
        Address = address;

    }


    public void changeColor(Vehicle vehicle){
        Scanner input = new Scanner(System.in);
        System.out.println("Current color is : "+vehicle.getColor()+"\n Please choose the new color you want for your car : ");
        String newColor= input.nextLine();
        vehicle.setColor(newColor);
        System.out.println("New Color is : "+vehicle.getColor());

    }
    public void checkCar(Vehicle vehicle){
        System.out.println(vehicle+"\n Checking the car .....");
        if (vehicle.getStatus().equals(ServiceStatus.Fixing)){
            System.out.println("Your car is still under check");
        } else if (vehicle.getStatus().equals(ServiceStatus.Waiting)){
            System.out.println("Your car still in queue, please wait...");
        } else {
            System.out.println("Your car is Ready to be picked, get them keys and rev that engine man !!!");
        }
    }
}

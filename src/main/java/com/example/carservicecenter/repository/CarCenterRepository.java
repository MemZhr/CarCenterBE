package com.example.carservicecenter.repository;

import com.example.carservicecenter.model.CarCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CarCenterRepository extends JpaRepository<CarCenter, Integer> {
}
package com.example.carservicecenter.repository;

import com.example.carservicecenter.model.Sedan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SedanRepository extends JpaRepository<Sedan, String> {
}
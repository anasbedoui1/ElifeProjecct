package com.example.travelreservation.repository;

import com.example.travelreservation.model.Louage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LouageRepository extends JpaRepository<Louage, Long> {
}
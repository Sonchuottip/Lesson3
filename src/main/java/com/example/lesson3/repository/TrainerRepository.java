package com.example.lesson3.repository;
import com.example.lesson3.entities.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainerRepository extends JpaRepository<Trainer, Integer> {
}

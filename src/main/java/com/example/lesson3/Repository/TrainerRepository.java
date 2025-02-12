package com.example.lesson3.Repository;
import com.example.lesson3.Entities.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface TrainerRepository extends JpaRepository<Trainer, Integer> {
}

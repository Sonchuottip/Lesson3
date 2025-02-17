package com.example.lesson3.repository;

import com.example.lesson3.entities.Horse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HorseRepository extends JpaRepository<Horse, Integer> {
    //List<Horse> findByFoaledYearAndTrainerId(Integer year, Integer trainerId);
}

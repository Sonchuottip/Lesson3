package com.example.lesson3.repository;

import com.example.lesson3.entities.Horse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface HorseRepository extends JpaRepository<Horse, Integer> {
    @Query("SELECT new Horse(h.id, h.name, h.foaled) " +
            "FROM Trainer t " +
            "JOIN HorseAccount ha ON t.account.id = ha.account.id " +
            "JOIN Horse h ON h.id = ha.horse.id " +
            "WHERE (:trainerId IS NULL OR t.id = :trainerId) " +
            "AND (:foaled IS NULL OR FUNCTION('YEAR', h.foaled) = :foaled)")
    List<Horse> findByTrainerAndYear(@Param("trainerId") Integer trainerId,
                                           @Param("foaled") Integer foaled);
}

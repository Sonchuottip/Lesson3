package com.example.lesson3.service;

import com.example.lesson3.entities.Horse;
import com.example.lesson3.repository.HorseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HorseService {
    @Autowired
    private HorseRepository horseRepository;

    public List<Horse> getAllHorse() {
        return horseRepository.findAll();
    }

    /*public List<Horse> getFilterHorses(Integer trainerId, Integer year) {
        return horseRepository.findByFoaledYearAndTrainerId(year, trainerId);
    }*/

    public Horse createHorse(Horse horse) {
        return horseRepository.save(horse);
    }

    public Horse updateHorse(Integer id, Horse horseDetails) {
        Horse updatedHorse = horseRepository.findById(id).orElseThrow(() -> new RuntimeException("Horse not found"));
        updatedHorse.setName(horseDetails.getName());
        updatedHorse.setFoaled(horseDetails.getFoaled());
        return horseRepository.save(updatedHorse);
    }

    public void deleteHorse(Integer id) {
        horseRepository.deleteById(id);
    }
}

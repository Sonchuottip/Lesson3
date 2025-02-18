package com.example.lesson3.controller;


import com.example.lesson3.entities.Horse;
import com.example.lesson3.repository.HorseRepository;
import com.example.lesson3.service.HorseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/horse")
public class HorseController {
    @Autowired
    private HorseService horseService;

    @GetMapping("/all")
    public ResponseEntity<List<Horse>> getAllHorses() {
        return ResponseEntity.ok(horseService.getAllHorse());
    }

    @GetMapping
    public ResponseEntity<List<Horse>> getFileredHorse(@RequestParam(required = false) Integer year,
                                                       @RequestParam(required = false) Integer trainerId) {
        return ResponseEntity.ok(horseService.getFilterHorses(year, trainerId));
    }

    @PostMapping
    public ResponseEntity<Horse> addHorse(@RequestBody Horse horse) {
        return ResponseEntity.ok(horseService.createHorse(horse));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Horse> updateHorse(@PathVariable Integer id, @RequestBody Horse horse) {
        return ResponseEntity.ok(horseService.updateHorse(id, horse));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteHorse(@PathVariable Integer id) {
        horseService.deleteHorse(id);
        return ResponseEntity.ok("Horse is deleted");
    }
}

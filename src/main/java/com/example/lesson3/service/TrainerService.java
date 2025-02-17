package com.example.lesson3.service;
import com.example.lesson3.entities.Trainer;
import com.example.lesson3.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TrainerService {
    private final TrainerRepository trainerRepository;
    public TrainerService(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }
    public List<Trainer> getAllTrainers() {
        return trainerRepository.findAll();
    }

    public Optional<Trainer> getTrainerbyId(Integer Id) {
        return trainerRepository.findById(Id);
    }

    public Trainer createTrainer(Trainer trainer) {
        return trainerRepository.save(trainer);
    }

    public Optional<Trainer> UpdateTrainer(int id,Trainer trainer) {
        return trainerRepository.findById(id).map(existingTrainer -> {
            existingTrainer.setName(trainer.getName());
            existingTrainer.setAccount(trainer.getAccount());
            return trainerRepository.save(existingTrainer);
        });
    }

    public boolean deleteTrainer(int Id) {
        if (trainerRepository.existsById(Id)) {
            trainerRepository.deleteById(Id);
            return true;
        }
        return false;
    }

}

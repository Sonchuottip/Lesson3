package com.example.lesson3.Service;
import com.example.lesson3.Entities.Trainer;
import com.example.lesson3.Repository.TrainerRepository;
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

    public Trainer CreateTrainer(Trainer trainer) {
        return trainerRepository.save(trainer);
    }

    public Optional<Trainer> UpdateTrainer(int id,Trainer trainer) {
        return trainerRepository.findById(id).map(existingTrainer -> {
            existingTrainer.setName(trainer.getName());
            existingTrainer.setAccountId(trainer.getAccountId());
            return Optional.of(trainerRepository.save(existingTrainer));
        }).orElse(Optional.empty());
    }

    public boolean deleteTrainer(int Id) {
        if (trainerRepository.existsById(Id)) {
            trainerRepository.deleteById(Id);
            return true;
        }
        return false;
    }

}

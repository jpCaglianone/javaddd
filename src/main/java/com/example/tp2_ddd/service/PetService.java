package com.example.tp2_ddd.service;

import com.example.tp2_ddd.domain.PetCadastradoEvent;
import com.example.tp2_ddd.model.Pet;
import com.example.tp2_ddd.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    @Autowired
    private PetRepository petRepository;

    public List<Pet> listarTodosPets() {
        return petRepository.findAll();
    }

    public boolean cadastrarPet(Pet pet) {
        try {
            Pet petSalvo = petRepository.save(pet);
            PetCadastradoEvent evento = new PetCadastradoEvent(
                    petSalvo.getId(),
                    petSalvo.getNome(),
                    petSalvo.getEspecie(),
                    petSalvo.getIdade()
            );
            eventPublisher.publishEvent(evento);

            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

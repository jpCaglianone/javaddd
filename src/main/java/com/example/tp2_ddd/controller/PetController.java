package com.example.tp2_ddd.controller;

import com.example.tp2_ddd.model.Pet;
import com.example.tp2_ddd.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pet")
public class PetController {

    @Autowired
    private PetService petService;

    @GetMapping("/todos")
    public List<Pet> listarPets() {
        return petService.listarTodosPets();
    }

    @PostMapping
    public String adicionarPet(@RequestBody Pet pet) {
        // Validação do Pet é feita pelo serviço
        if (petService.cadastrarPet(pet)) {
            return "Pet cadastrado com sucesso!";
        } else {
            return "Erro ao cadastrar pet ou informações de cadastro incorretas!";
        }
    }
}

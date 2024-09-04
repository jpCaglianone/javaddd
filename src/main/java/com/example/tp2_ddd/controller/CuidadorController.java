package com.example.tp2_ddd.controller;

import com.example.tp2_ddd.model.Cuidador;
import com.example.tp2_ddd.repository.CuidadorRepository;
import com.example.tp2_ddd.service.CuidadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cuidador")
public class CuidadorController {

    @Autowired
    private CuidadorService cuidadorService;

    @GetMapping("/todos")
    public List<Cuidador> listarCuidadores() {
        return cuidadorService.listarTodosCuidadores();
    }

    @PostMapping
    public String adicionarCuidador(@RequestBody Cuidador cuidador) {

        if (cuidador.validacao()) {
            if (cuidadorService.cadastrarCuidador(cuidador)) {
                return "Cuidador cadastrado com sucesso!";
            }
            else{
                return "Erro ao cadastrar cuidador!";
            }
        }
    else{
        return "Informações de cadastro incorretas!";
        }


    }
}

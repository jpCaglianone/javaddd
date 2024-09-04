package com.example.tp2_ddd.controller;

import com.example.tp2_ddd.model.Servico;
import com.example.tp2_ddd.service.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servico")
public class ServicoController {

    @Autowired
    private ServicoService servicoService;

    @GetMapping("/todos")
    public List<Servico> listarServicos() {
        return servicoService.listarTodosServicos();
    }

    @PostMapping
    public String adicionarServico(@RequestBody Servico servico) {
        if (servicoService.cadastrarServico(servico)) {
            return "Serviço cadastrado com sucesso!";
        } else {
            return "Erro ao cadastrar serviço ou informações de cadastro incorretas!";
        }
    }
}

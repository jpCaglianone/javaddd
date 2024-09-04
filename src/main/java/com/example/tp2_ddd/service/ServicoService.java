package com.example.tp2_ddd.service;

import com.example.tp2_ddd.model.Servico;
import com.example.tp2_ddd.repository.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoService {

    @Autowired
    private ServicoRepository servicoRepository;

    public List<Servico> listarTodosServicos() {
        return servicoRepository.findAll();
    }

    public boolean cadastrarServico(Servico servico) {
        // Simples validação manual
        if (servico.getDescricao() != null && !servico.getDescricao().trim().isEmpty() &&
                servico.getPreco() >= 0) {
            try {
                servicoRepository.save(servico);
                return true;
            } catch (Exception e) {
                System.out.println("Erro ao salvar o serviço: " + e.getMessage());
                return false;
            }
        } else {
            System.out.println("Dados inválidos para o serviço: " + servico);
            return false;
        }
    }
}

package com.example.tp2_ddd.service;

import com.example.tp2_ddd.model.Cuidador;
import com.example.tp2_ddd.repository.CuidadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuidadorService {

    @Autowired
    private CuidadorRepository cuidadorRepository;

    public List<Cuidador> listarTodosCuidadores() {
        return cuidadorRepository.findAll();
    }

    public boolean cadastrarCuidador(Cuidador cuidador) {
        try{
            cuidadorRepository.save(cuidador);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}

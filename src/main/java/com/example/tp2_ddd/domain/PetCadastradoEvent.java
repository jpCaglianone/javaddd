package com.example.tp2_ddd.domain;

import com.example.tp2_ddd.domain.DominioEvent;

public class PetCadastradoEvent extends DominioEvent {

    private final Long petId;
    private final String nome;
    private final String especie;
    private final int idade;

    public PetCadastradoEvent(Long petId, String nome, String especie, int idade) {
        super();
        this.petId = petId;
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }


    public Long getPetId() {
        return petId;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "PetCadastradoEvent{" +
                "petId=" + petId +
                ", nome='" + nome + '\'' +
                ", especie='" + especie + '\'' +
                ", idade=" + idade +
                ", dataHora=" + getDataHora() +
                '}';
    }
}

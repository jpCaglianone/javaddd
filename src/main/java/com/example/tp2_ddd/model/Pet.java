package com.example.tp2_ddd.model;

import jakarta.persistence.*;

@Entity
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String especie;
    private int idade;

    public Pet(String nome, String especie, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }

    public Pet() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", especie='" + especie + '\'' +
                ", idade=" + idade +
                '}';
    }

    public boolean validacao(){
        if(this.especie == null || this.especie.isEmpty()
                || this.idade <= 0
                || this.nome == null || this.nome.isEmpty()){
            return false;
        }

        return true;
    }
}
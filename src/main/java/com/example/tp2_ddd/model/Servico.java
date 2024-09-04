package com.example.tp2_ddd.model;


import jakarta.persistence.*;

@Entity
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private double preco;

    @ManyToOne
    private Pet pet;

    @ManyToOne
    private Cuidador cuidador;

    public Servico() {
    }

    public Servico(String descricao, double preco, Pet pet, Cuidador cuidador) {
        this.descricao = descricao;
        this.preco = preco;
        this.pet = pet;
        this.cuidador = cuidador;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Cuidador getCuidador() {
        return cuidador;
    }

    public void setCuidador(Cuidador cuidador) {
        this.cuidador = cuidador;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", pet=" + pet +
                ", cuidador=" + cuidador +
                '}';
    }
}

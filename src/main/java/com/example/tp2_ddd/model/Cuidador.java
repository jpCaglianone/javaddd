package com.example.tp2_ddd.model;


import jakarta.persistence.*;

@Entity
public class Cuidador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String especialidade;
    private String telefone;

    public Cuidador() {
    }

    public Cuidador(String nome, String especialidade, String telefone) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.telefone = telefone;
    }

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

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cuidador{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", especialidade='" + especialidade + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }

    public boolean validacao(){
        if(this.especialidade == null || this.especialidade.isEmpty()
        || this.telefone == null || this.telefone.isEmpty()
        || this.nome == null || this.nome.isEmpty()){
            return false;
        }
        if(this.telefone.length() < 10){
            return false;
        }

        return true;
    }

}

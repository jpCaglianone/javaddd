package com.example.tp2_ddd.repository;


import com.example.tp2_ddd.model.Servico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicoRepository extends JpaRepository<Servico, Long> {

}
package com.example.ac1_atividade2_using_database.repository;

import com.example.ac1_atividade2_using_database.entidade.Funcionario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository <Funcionario, Integer> {
    
}
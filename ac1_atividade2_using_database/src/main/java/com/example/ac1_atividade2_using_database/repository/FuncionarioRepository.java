package com.example.ac1_atividade2_using_database.repository;

import com.example.ac1_atividade2_using_database.entidade.Funcionario;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

public interface FuncionarioRepository extends JpaRepository <Funcionario, Integer> {
    //CrudRepository<Funcionario, String>
}
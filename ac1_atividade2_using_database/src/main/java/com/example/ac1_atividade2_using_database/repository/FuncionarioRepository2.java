package com.example.ac1_atividade2_using_database.repository;

import com.example.ac1_atividade2_using_database.entidade.Funcionario;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository2 extends CrudRepository<Funcionario, String> {

}
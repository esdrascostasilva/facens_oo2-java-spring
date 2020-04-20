package com.example.ac1_atividade2_using_database.servico;

import java.util.List;

import com.example.ac1_atividade2_using_database.repository.FuncionarioRepository;
import com.example.ac1_atividade2_using_database.entidade.Funcionario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioServico {

    @Autowired
    private FuncionarioRepository repository;

    public List<Funcionario> getFuncionarios(){
        
        return repository.findAll();

    }

    public List<Funcionario> saveFuncionarios(){
        return repository.saveAll(saveFuncionarios());
    }

}
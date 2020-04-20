package com.example.ac1_atividade2_using_database.controle;

import com.example.ac1_atividade2_using_database.servico.FuncionarioServico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FuncionarioControle {

    @Autowired
    private FuncionarioServico servico;

    //Method return all Funcionarios to template
    @GetMapping("/funcionarios")
    public ModelAndView getFuncionarios(){
        
        ModelAndView mv = new ModelAndView("funcionarios");
        mv.addObject("funcionarios", servico.getFuncionarios());

        return mv;
   }

}
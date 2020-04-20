package com.example.ac1_atividade2_using_database.controle;

import com.example.ac1_atividade2_using_database.entidade.Funcionario;
//import com.example.ac1_atividade2_using_database.repository.FuncionarioRepository;
import com.example.ac1_atividade2_using_database.repository.FuncionarioRepository2;
import com.example.ac1_atividade2_using_database.servico.FuncionarioServico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FuncionarioControle {

    @Autowired
    private FuncionarioServico servico;

    //Using for save in Database
    @Autowired
    private FuncionarioRepository2 funcionariorepository;

    
    //Method return all Funcionarios to template
    @GetMapping("/funcionarios")
    public ModelAndView getFuncionarios(){
        
        ModelAndView mv = new ModelAndView("funcionarios"); //funcionarios é o nome da View
        mv.addObject("funcionarios", servico.getFuncionarios());

        return mv;
   }

   //Qualquer coisa delete td a partir daqui kkkk
   @RequestMapping(value = "/cadastrarfuncionario", method=RequestMethod.GET)
    public String form(){
       return "cadastrarfuncionario";
   }

   @RequestMapping(value = "/cadastrarfuncionario", method=RequestMethod.POST)
    public String form(Funcionario funcionarioo){
        funcionariorepository.save(funcionarioo);
        return "redirect:/cadastrarfuncionario";
   }

}
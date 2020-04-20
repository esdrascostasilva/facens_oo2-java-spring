package com.example.ac1_atividade2_using_database.entidade;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Funcionario implements Serializable {
        
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    @Id
    private int registro;
    private String nome;
    private int centroCusto;
    private String departamento;
    private String funcao;

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCentroCusto() {
        return centroCusto;
    }

    public void setCentroCusto(int centroCusto) {
        this.centroCusto = centroCusto;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "Funcionario [centroCusto=" + centroCusto + ", departamento=" + departamento + ", funcao=" + funcao
                + ", nome=" + nome + ", registro=" + registro + "]";
    }

    

}
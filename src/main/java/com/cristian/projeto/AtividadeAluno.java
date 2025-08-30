package com.cristian.projeto;

public class AtividadeAluno {
    private String nome;
    private int matricula;
    private String curso;

    public String getNome(){
        return nome;
    };
    public int getMatricula(){
        return matricula;
    }
    public String getCurso(){
        return curso;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }

    void Comemorar(){
        System.out.println("IIIIIIIIAAAAHAUUUUUUU, bora cuzinhar");
    }
    void mostrarInfo(){
        System.out.println("Nome: " + nome + "  Matricula: " + matricula + "  Curso: " + curso);
    }
}

package com.cristian.projeto;

public class AtividadeAlunoContinuacao {
    public static void main(String[] args) {
        AtividadeAluno a1 = new AtividadeAluno();

        a1.setNome("Cris");
        a1.setMatricula(907581);
        a1.setCurso("Confeiteiro");

        System.out.println("Nome: " + a1.getNome());
        System.out.println("Matricula: " + a1.getMatricula());
        System.out.println("Curso: " + a1.getCurso());
        a1.Comemorar();
        a1.mostrarInfo();
    }
}

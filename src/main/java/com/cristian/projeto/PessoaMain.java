package com.cristian.projeto;

public class PessoaMain {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        //Scanner scanner = new Scanner(Syistem.in);
        p1.setNome("Roberto Dinamite");
        p1.setIdade(999);

        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());
    }
}

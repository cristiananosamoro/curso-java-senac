package com.cristian.projeto;

public class Condicional4 {
    public static void main(String[] args) {
        
        int notaDoAluno = 82;
        if(notaDoAluno >= 90){
System.out.println("Conceito S: Exelente!");
        }
        else if (notaDoAluno >= 80){
            System.out.println("Conceito A: Muito bom");
        }
        else if (notaDoAluno >= 70){
            System.out.println("Conceito B: Bom");
        }
        else if (notaDoAluno >= 60){
            System.out.println("Conceito C: Regular");
        }
        else {
            System.out.println("Conceito F: Precisa melhorar");
        }
    } 
}

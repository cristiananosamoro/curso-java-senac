package com.cristian.projeto;

public class Arrayatividade {
    public static void main(String[] args) {
        int[] numeros = { 2, 4, 6, 8, 10};
        int soma=0;
        for(int i=0; i < numeros.length; i++){
            soma+=numeros[i];
        }
        System.out.println(soma);
        }
    }

package com.cristian.projeto;

import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {
        int[] numeros = { 8, 9, 7, 25};
        
        System.out.println(Arrays.toString(numeros));
        numeros[1] = 39;
        System.out.println("Atualização " + numeros[1]);
        System.out.println(Arrays.toString(numeros));
    }
}

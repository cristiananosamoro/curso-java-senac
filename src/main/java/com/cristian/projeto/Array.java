package com.cristian.projeto;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int [] numeros = {2, 3, 45, 25, 85};
        int numero1 = numeros[4];
        int numero2 = numeros[0];
        System.out.println("Exibindo alguns numeros " + numeros[2]);
        System.out.println("Exibindo alguns números " + numero1 + " e " + numero2);
        System.out.println(Arrays.toString(numeros));
    }
}

package com.cristian.projeto;

public class Funcoes2 {
    public static int calcularArea(int largura, int altura){
        int area = largura * altura;
        return area;
    }
    public static void main(String[] args) {
        int areaCalculada = calcularArea(5,10);
        System.out.println("A área é: " + areaCalculada);
    }
}

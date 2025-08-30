package com.cristian.projeto;

public class Carro {
    //Atributos
    String marca;
    String cor;
    int ano;

    //Construtor
    public Carro(String marca, String cor, int ano){
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
    }

    //métodos
    void buzinar() {
        System.err.println("Biiiiiiiiiii biiiiiiiiiiiiiiiiiii");
    }

    void mostrarInfo() {
        System.out.println("marca: " + marca + ", cor: " + cor + ", ano: " + ano);
    }
}

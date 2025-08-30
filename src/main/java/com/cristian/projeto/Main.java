package com.cristian.projeto;

public class Main {
    public static void main(String[] args) {

        Carro c1 = new Carro("Fiat", "preto", 2014);
        Carro c2 = new Carro("Ford", "branco", 2015);
        c1.mostrarInfo();
        c2.mostrarInfo();
        c1.buzinar();
        c2.buzinar();

       // Carro meuCarro = new Carro();

       // meuCarro.marca = "Fiat 500";
       // meuCarro.cor = "Preto";
       // meuCarro.ano = 2014;

       // meuCarro.buzinar();
       // meuCarro.mostrarInfo();

       // Carro teucarro = new Carro();
       // teucarro.marca = "vw";
       // teucarro.cor = "cinza";
       // teucarro.ano = 1969;

       // teucarro.mostrarInfo();
    }
}

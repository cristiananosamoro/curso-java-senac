package com.cristian.projeto;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class ExemploController {
    @GetMapping("/multiplos")
    public String verificarMultiplos(int limite) {
       String resultado = "";
        for(int i = 1; i <= limite; i++){
            if (i % 3 == 0) {
                resultado += i + " é multiplo de 3 <br>";
            }
            else{
                resultado += i + " Não é multiplo de 3 <br>";
            }
        }
        return resultado;
    }
    
}

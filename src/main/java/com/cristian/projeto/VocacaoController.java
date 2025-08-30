package com.cristian.projeto;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class VocacaoController {
    @GetMapping("/votacao")
    public String ContarVotos() {
        int[] votos = {1, 2, 3, 3, 2, 1, 3, 3, 2, 1, 4, 4, 4, 2};

        int candidato = 0;
        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;

        for (int voto : votos) //int voto: votos = int i = 0; i< votos.lenth; i++
        {
            if (voto == 1) {
                candidato++;
            }
            else if (voto == 2) {
            candidato1++;
        }
            else if (voto == 3) {
            candidato2++;
        }
            else if (voto == 4) {
            candidato3++;
        }
    }
    String resultado = "";
    resultado += "Candidato 1: " + candidato + " votos<br>";
    resultado += "Candidato 2: " + candidato1 + " votos<br>";
    resultado += "Candidato 3: " + candidato2 + " votos<br>";
    resultado += "Candidato 4: " + candidato3 + " votos<br>";

    return resultado;
    }
    
}

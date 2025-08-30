package com.cristian.projeto;

import org.springframework.web.bind.annotation.RestController;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class AlunoController {
    @GetMapping("/alunos")
    public List<Aluno> listarAlunos() {
        return List.of(
            new Aluno("João", 15),
            new Aluno("Victor", 24),
            new Aluno("Gabriela", 35)
        );
    }
    
}

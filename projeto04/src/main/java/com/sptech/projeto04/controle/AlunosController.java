package com.sptech.projeto04.controle;

import com.sptech.projeto04.entidade.Alunos;
import com.sptech.projeto04.entidade.Linha;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunosController {

    private List<Alunos> alunos = new ArrayList<>();

    @PostMapping
    public String postAluno(@RequestBody Alunos novoAluno) {
        alunos.add(novoAluno);
        return "Aluno cadastrado com sucesso!";
    }

    @GetMapping("/{indice}")

}

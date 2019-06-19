package com.example.cadastro.web;

import com.example.cadastro.domain.Pessoa;
import com.example.cadastro.dto.NomeDTO;
import com.example.cadastro.repository.PessoaRepository;
import com.example.cadastro.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class CadastroController {
    @Autowired
    private PessoaRepository PessoaRepository;

    @Autowired
    private PessoaService pessoaService;

    @GetMapping
    public List<Pessoa> getAll() {
        return PessoaRepository.findAll();
    }

    @PostMapping
    public Pessoa adicionarPessoa(@RequestBody  Pessoa pessoa) {
        return PessoaRepository.save(pessoa);
    }

    @PostMapping("/{id}")
    public Pessoa editaPessoa(@PathVariable Integer id, @RequestBody NomeDTO nomeDTO) {
        return pessoaService.editarPessoa(id, nomeDTO);
    }
}

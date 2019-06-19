package com.example.cadastro.services;

import com.example.cadastro.domain.Pessoa;
import com.example.cadastro.dto.NomeDTO;
import com.example.cadastro.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository PessoaRepository;

    @Transactional
    public Pessoa editarPessoa(Integer id, NomeDTO nomeDTO){

        Optional<Pessoa> optionalPessoa = PessoaRepository.findById(id);

        if(optionalPessoa.isPresent()){
            Pessoa pessoa = optionalPessoa.get();
            String Capitalizado = CapitalizaService.capitalizar(nomeDTO.getNome());

           pessoa.setNome(Capitalizado);

           //pessoa.setNome(nomeDTO.getNome());

            return PessoaRepository.save(pessoa);
        }
        return null;


    }
}

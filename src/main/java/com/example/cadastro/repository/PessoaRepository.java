package com.example.cadastro.repository;

import com.example.cadastro.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa,Integer> {



}

package br.com.carlos.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.carlos.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, UUID>{

}

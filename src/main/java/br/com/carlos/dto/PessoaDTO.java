package br.com.carlos.dto;

import java.util.UUID;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public record PessoaDTO(@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		UUID idPessoa,
		String nomePessoa,
		String documentNumber) {}

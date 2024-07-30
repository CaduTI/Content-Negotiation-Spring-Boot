package br.com.carlos.service;

import java.util.UUID;

import br.com.carlos.dto.PessoaDTO;

public interface PessoaService {
	public PessoaDTO getPessoa(UUID id);
	public PessoaDTO createPessoa(PessoaDTO pessoa);
	public PessoaDTO updatePessoa(PessoaDTO pessoa);
	void deletePessoa(UUID id);
}

package br.com.carlos.service.impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.carlos.dto.PessoaDTO;
import br.com.carlos.exceptions.ResourceNotFoundExcetion;
import br.com.carlos.mapper.PessoaMapper;
import br.com.carlos.model.Pessoa;
import br.com.carlos.repository.PessoaRepository;
import br.com.carlos.service.PessoaService;

@Service
public class PessoaServiceImpl implements PessoaService{
	
	@Autowired
	PessoaRepository repository;
	
	@Autowired
	PessoaMapper mapper;
	
	@Override
	public PessoaDTO getPessoa(UUID id) {
		Pessoa findbyid = repository.findById(id)
				.orElseThrow((() -> new ResourceNotFoundExcetion("No records found for this ID!")));
		
		PessoaDTO dto = mapper.toDTO(findbyid);
		
		return dto;
	}

	@Override
	public PessoaDTO createPessoa(PessoaDTO pessoa) {
		Pessoa entidade = mapper.toEntity(pessoa);
		
		PessoaDTO dto = mapper.toDTO(repository.save(entidade));
		
		return dto;
	}

	@Override
	public PessoaDTO updatePessoa(PessoaDTO pessoa) {
		Pessoa findbyid = repository.findById(pessoa.idPessoa())
				.orElseThrow((() -> new ResourceNotFoundExcetion("No records found for this ID!")));
		
		
		findbyid.setNomePessoa(pessoa.nomePessoa());
		findbyid.setDocumentNumber(pessoa.documentNumber());
		PessoaDTO dto = mapper.toDTO(repository.save(findbyid));
		
		return dto;
	}

	@Override
	public void deletePessoa(UUID id) {
		Pessoa findbyid = repository.findById(id)
				.orElseThrow((() -> new ResourceNotFoundExcetion("No records found for this ID!")));
		
		repository.delete(findbyid);
		
	}

}

package br.com.carlos.mapper;

import org.springframework.stereotype.Component;

import br.com.carlos.dto.PessoaDTO;
import br.com.carlos.model.Pessoa;

@Component
public class PessoaMapper {
	public PessoaDTO toDTO(Pessoa entidade) {
		return new PessoaDTO(entidade.getIdPessoa(), entidade.getNomePessoa(), entidade.getDocumentNumber());
	}
	
	
	public Pessoa toEntity(PessoaDTO dto) {
		Pessoa entidade = new Pessoa();
		
		entidade.setIdPessoa(dto.idPessoa());
		entidade.setNomePessoa(dto.nomePessoa());
		entidade.setDocumentNumber(dto.documentNumber());
		
		return entidade;
	}
}

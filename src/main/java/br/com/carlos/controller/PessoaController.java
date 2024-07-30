package br.com.carlos.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.carlos.dto.PessoaDTO;
import br.com.carlos.service.impl.PessoaServiceImpl;
import br.com.carlos.util.MediaType;
@RestController
@RequestMapping("/pessoa")
public class PessoaController {
	
	@Autowired
	PessoaServiceImpl services;
	
	@GetMapping(
			value = "/{id}",
			produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML, MediaType.APPLICATION_YML})
	public PessoaDTO getPessoa(@PathVariable UUID id) {
		return services.getPessoa(id);
	}
	
	@PostMapping(
			consumes = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML, MediaType.APPLICATION_YML},
			produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML, MediaType.APPLICATION_YML})
	public PessoaDTO createPessoa(@RequestBody PessoaDTO dto) {
		return services.createPessoa(dto);
	}
	
	@PutMapping(
			consumes = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML, MediaType.APPLICATION_YML},
			produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML, MediaType.APPLICATION_YML})
	public PessoaDTO updatePessoa(@RequestBody PessoaDTO dto) {
		return services.updatePessoa(dto);
	}
	
	@DeleteMapping(
			value = "/{id}",
			produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML, MediaType.APPLICATION_YML})
	public ResponseEntity<?> deletePessoa(@PathVariable UUID id) {
		return ResponseEntity.noContent().build();
	}
}

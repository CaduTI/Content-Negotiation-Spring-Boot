package br.com.carlos.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Pessoa")
public class Pessoa implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID idPessoa;
	
	@Column(name = "",nullable = false)
	private String nomePessoa;
	
	@Column(name = "",nullable = false)
	private String documentNumber;

	
	public Pessoa() {};
	
	
	public Pessoa(UUID idPessoa, String nomePessoa, String documentNumber) {
		super();
		this.idPessoa = idPessoa;
		this.nomePessoa = nomePessoa;
		this.documentNumber = documentNumber;
	}

	public UUID getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(UUID idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	@Override
	public int hashCode() {
		return Objects.hash(documentNumber, idPessoa, nomePessoa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(documentNumber, other.documentNumber) && Objects.equals(idPessoa, other.idPessoa)
				&& Objects.equals(nomePessoa, other.nomePessoa);
	}
	
	
}

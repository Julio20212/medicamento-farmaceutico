package com.farmacia.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "farmaceutico")

public class Farmaceutico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@NotBlank
	private String nome;

	@NotNull
	@NotBlank
	private String endereco;

	@NotNull
	@NotBlank
	@Size(max = 13, message = "Máximo de 13 caracteres")
	private String telefone;

	@NotNull
	@NotBlank
	@Size(max = 14, message = "Máximo de 14 caracteres")
	private String cpf;

	@NotNull
	@NotBlank
	@Size(max = 12, message = "Máximo de 12 caracteres")
	private String rg;

	@NotNull
	@NotBlank
	private String salario;

	@NotNull
	@NotBlank
	private String crf;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	public String getCrf() {
		return crf;
	}

	public void setCrf(String crf) {
		this.crf = crf;
	}

}

package br.com.fiap.checkpoint2.model;

import java.sql.Date;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "pacientes")
public class Paciente extends AbstractEntity<Long> {
	
	@Column(nullable = false, length = 20)
	private String nome;
	
	@Column(length = 50)
	private String endereco;
	@Column(length = 20)
	private String bairro;
	@Column(length = 20)
	private String email;
	@Column(length = 11)
	private String telefoneCompleto;
	
	
	@Column(nullable = false)
	private Date dataNascimento;
	
	@Column(nullable = false, columnDefinition = "TIMESTAMP")
	private LocalDate createdAt;
	
	@Column(nullable = false, columnDefinition = "TIMESTAMP")
	private LocalDate updatedAt;

	
	
	
	
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

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefoneCompleto() {
		return telefoneCompleto;
	}

	public void setTelefoneCompleto(String telefoneCompleto) {
		this.telefoneCompleto = telefoneCompleto;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public LocalDate getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDate getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDate updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
	
	
}

package br.com.fiap.checkpoint2.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "profissionais")
public class Profissional extends AbstractEntity<Long>{

	@Column(nullable = false, length = 20)
	private String nome;
	
	@Column(nullable = false, length = 20)
	private String especialidade;
	
	@Column(columnDefinition = "NUMERIC(15,2)")
	private BigDecimal valorHora;
	
	
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

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public BigDecimal getValorHora() {
		return valorHora;
	}

	public void setValor_hora(BigDecimal valorHora) {
		this.valorHora = valorHora;
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

	public void setUpdated_at(LocalDate updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
}

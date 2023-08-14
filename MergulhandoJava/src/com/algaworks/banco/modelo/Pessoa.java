package com.algaworks.banco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class Pessoa {
	
	private String nome;
	private String documento;
	private BigDecimal rendimentoAnual;
	private TipoPessoa tipo = TipoPessoa.FISICA;
	private LocalDateTime dataUltimaAtualização = LocalDateTime.now();
	
	public Pessoa() {}
	
	public Pessoa(String nome, String documento) {
		super();
		this.nome = nome;
		this.documento = documento;
	}
	public BigDecimal getRendimentoAnual() {
		return rendimentoAnual;
	}
	public void setRendimentoAnual(BigDecimal rendimentoAnual) {
		this.rendimentoAnual = rendimentoAnual;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public TipoPessoa getTipo() {
		return tipo;
	}
	public void setTipo(TipoPessoa tipo) {
		this.tipo = tipo;
	}
	public LocalDateTime getDataUltimaAtualização() {
		return dataUltimaAtualização;
	}
	public void setDataUltimaAtualização(LocalDateTime dataUltimaAtualização) {
		this.dataUltimaAtualização = dataUltimaAtualização;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", documento=" + documento + ", tipo=" + tipo + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(documento);
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
		return Objects.equals(documento, other.documento);
	}
	
}

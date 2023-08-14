package com.algaworks.banco.modelo.pagamento;

import java.math.BigDecimal;

import com.algaworks.banco.modelo.Pessoa;

public class Holerite implements DocumentoPagavel{

	private Pessoa funcionario;
	private BigDecimal valorHora;
	private  int quantidadeHoras;
	private boolean estaPago;
	
	
	public Holerite(Pessoa funcionario, BigDecimal valorHora, int quantidadeHoras) {
		super();
		this.funcionario = funcionario;
		this.valorHora = valorHora;
		this.quantidadeHoras = quantidadeHoras;
	}

	@Override
	public BigDecimal getValorTotal() {
		return valorHora.multiply(new BigDecimal(quantidadeHoras));
	}

	@Override
	public boolean estaPago() {

		return estaPago;
	}

	@Override
	public void quitarPagamento() {
		estaPago = true;
	}

}

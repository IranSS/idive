package com.algaworks.banco.app;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.algaworks.banco.modelo.ContaEspecial;
import com.algaworks.banco.modelo.ContaInvestimento;
import com.algaworks.banco.modelo.Pessoa;
import com.algaworks.banco.modelo.TipoPessoa;
import com.algaworks.banco.modelo.atm.CaixaEletronico;
import com.algaworks.banco.modelo.excecao.SaldoInsuficienteException;
import com.algaworks.banco.modelo.pagamento.Boleto;
import com.algaworks.banco.modelo.pagamento.Holerite;

public class Principal {

	public static void main(String[] args) {
		Pessoa titular1 = new Pessoa();
		titular1.setNome("João da Silva");
		titular1.setDocumento("123251469");
		titular1.setRendimentoAnual(new BigDecimal("15000"));
		titular1.setTipo(TipoPessoa.JURIDICA);
		
		titular1.setDataUltimaAtualização(LocalDateTime.parse("2023-07-13T13:20:00"));
		System.out.println(titular1.getDataUltimaAtualização());
		
		System.out.println(titular1.getTipo());
		
		Pessoa titular2 = new Pessoa();
		titular2.setNome("Maria Abadia");
		titular2.setDocumento("659684898" );
		
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		
		ContaInvestimento minhaConta = new ContaInvestimento(titular1, 123, 987);
		ContaEspecial suaConta = new ContaEspecial(titular2, 222, 333, new BigDecimal ("1000"));
		
		try {
			
		minhaConta.depositar(new BigDecimal("30000"));
		minhaConta.sacar(new BigDecimal("1000"));
		
//		minhaConta.creditarRedimentos(0.8);
//		minhaConta.debitarTarifaMensal();
		
		suaConta.depositar(new BigDecimal("15000"));
		suaConta.sacar(new BigDecimal ("15500"));
		suaConta.debitarTarifaMensal();
		
		
		caixaEletronico.imprimirSaldo(minhaConta);  
		caixaEletronico.imprimirSaldo(suaConta);
				
		Boleto boletoEscola = new Boleto(titular1, new BigDecimal ("35000"));
		Holerite salarioFuncionario = new Holerite(titular1, new BigDecimal ("100"), 160);
		
		caixaEletronico.pagar(boletoEscola, minhaConta);
		caixaEletronico.pagar(salarioFuncionario, minhaConta);
		
		caixaEletronico.estornarPagamento(boletoEscola, minhaConta);
		
		boletoEscola.imprimirRecibo();
		salarioFuncionario.imprimirRecibo();

		caixaEletronico.imprimirSaldo(minhaConta);
		
		} catch (SaldoInsuficienteException e) {
			System.out.println("ERRO! erro ao executar operação na conta: " + e.getMessage());
		}

	}
}

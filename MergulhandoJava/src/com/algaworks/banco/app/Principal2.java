package com.algaworks.banco.app;

import java.util.HashSet;
import java.util.Set;

import com.algaworks.banco.modelo.Pessoa;

public class Principal2 {
	
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("João da Silva", "25484747879");
		Pessoa pessoa2 = new Pessoa("Maria das Couves", "222222588");
		
//		List<Pessoa> pessoas = new ArrayList<>();
		Set<Pessoa> pessoas = new HashSet<>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		
//		System.out.println(pessoas);
		
//		Pessoa pessoa3 = pessoas.get();
//		System.out.println(pessoa3);
		
//		for(int i = 0; i < pessoas.size(); i++) {
//			System.out.println(pessoas.get(i).getNome());
//		}
		
//		for(Pessoa pessoa : pessoas) {
//			System.out.println(pessoa.getNome());
//		}
		
		Pessoa pessoa4 = new Pessoa("João da Silva", "25484747879"); 
		boolean existe = pessoas.contains(pessoa4);
		System.out.println(existe);
		
//		System.out.println(pessoa1.equals(pessoa4));
	}
}

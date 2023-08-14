package com.algaworks.fundamentos;

public class OlaMergulhador {
	
	public static void main(String[] args) {
		
		String nomeCompleto = "José Sebastião";
		nomeCompleto = "João da Silva";
		
		System.out.println("Olá, Mergulhador!");
		System.out.println("Nome: " + nomeCompleto);
		
		int minhaIdade = 41;
		int suaIdade = 25;
		
		int totalIdades = minhaIdade + suaIdade;
		
		System.out.println(totalIdades);
		
		double peso = 84.9;
		System.out.println(peso);
		
		float taxa = 1294.93f;
		System.out.println(taxa);
		
		boolean compraAprovada = false;
		System.out.println(compraAprovada);
		
		boolean maiorIdade = minhaIdade > 18;
		System.out.println(maiorIdade);
	}
}

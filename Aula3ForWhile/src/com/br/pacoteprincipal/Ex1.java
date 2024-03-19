package com.br.pacoteprincipal;

public class Ex1 {

	public static void main(String[] args) {
		
		int contagemPares = 0;
		int numero = 0;
		int somaPares = 0;
		for (int i = 0; i <= 100; i++) {
		if((i % 2)==0) {
			numero = somaPares;
			somaPares = numero + i;
			contagemPares++;
			
			}
		}
		System.out.println("Resultado da soma: " + somaPares);
		System.out.println("Quantidade de pares: " + contagemPares);
	}
}
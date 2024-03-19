package com.br.pacotesecundario;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Número para fazer a contagem regressiva: ");
		
		int numero = sc.nextInt();
		
		while (numero > 0) {
			System.out.println(numero);
			numero--;
		}

	}

}
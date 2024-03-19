package com.br.pacotesecundario;

import java.util.Scanner;
public class Ex4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char continuar = 's';
		
		while (continuar == 's' || continuar == 'S'){
				System.out.print("Temperatura em celsius: ");
				float celsius = sc.nextFloat();
				
				float fahrenheit = (celsius * 9 / 5) + 32;
				System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
				
				System.out.println("Deseja converter outra temperatura? (S/n): ");
				continuar = sc.next().charAt(0);
				
		}
		System.out.println("Fim.");
		sc.close();

	}

}

package com.br.pacoteprincipal;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);

	System.out.print("Número: ");
	int numero = sc.nextInt();
	
	for (int i = 1; i <=10; i++){
		int resultado = numero * i;
		System.out.println(numero + " x " + i + " = " + resultado);
	}
	sc.close();
	}
}

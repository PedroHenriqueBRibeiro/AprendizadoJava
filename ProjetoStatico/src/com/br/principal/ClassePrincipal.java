package com.br.principal;

import java.util.Scanner;

import com.br.pacotedois.ClasseDois;
import com.br.pacotedois.ClasseTres;

public class ClassePrincipal {
	public static void main(String[]args) {
		
		for (int i = 1; i < 10; i ++) {
			System.out.println("Interação" + i);
		}
		
		
		ClasseDois.metodoEstatico();
		ClasseDois objetoClasseDois = new ClasseDois();
		objetoClasseDois.metodoInstancia();
		
		ClasseTres.metodoEstatico();
		ClasseTres objetoClasseTres = new ClasseTres();
		objetoClasseTres.metodoMisto();
		
		System.out.println("Código executado na principal.");
	}

}

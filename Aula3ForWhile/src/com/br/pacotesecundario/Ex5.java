package com.br.pacotesecundario;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		String senhaCerta = "senha123";

		Scanner sc = new Scanner(System.in);
		boolean senhaCertaDigitada = false;
		
		while (!senhaCertaDigitada) {
			System.out.print("Digite a senha: ");
			String senhaDigitada = sc.nextLine();
			
	         if (senhaDigitada.equals(senhaCerta)) {
	              senhaCertaDigitada = true;
	              System.out.println("Senha correta! Acesso concedido.");
	          } else {
	              System.out.println("Senha incorreta! Tente novamente.");
	          }
	      }

	        sc.close();
		}

	}

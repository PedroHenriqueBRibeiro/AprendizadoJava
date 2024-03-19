package com.br.pacoteprincipal;
import java.util.Scanner;
import java.util.Random;

public class AppSistemaBancario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		boolean continuar = true;
		while (continuar) {
			
			System.out.println();
			System.out.println("Bem-vindo ao sistema de gerenciamento bancário!");
			System.out.println("Digite o número da sua conta: ");
			System.out.println();

			String numeroConta = sc.nextLine();
			
			System.out.println("Selecione o tipo de conta: ");
			System.out.println();
			System.out.println("1 - Conta Corrente");
			System.out.println("2 - Conta Poupança");
			System.out.println();
			System.out.println("=================================================================");
			System.out.println();

			int tipoConta = sc.nextInt();
			
			
			double saldoInicial = random.nextInt(100000);
			System.out.println("Saldo: R$" + saldoInicial);
			System.out.println();
			
			
			
			System.out.println("Selecione a operação desejada: ");
			System.out.println();
			System.out.println("1 - Sacar");
			System.out.println("2 - Depositar");
			System.out.println();
			System.out.println("=================================================================");
			System.out.println();

			int operacao = sc.nextInt();
			
			double valorOperacao;
			if (operacao == 1) {
				System.out.println();
				System.out.println("Digite o valor para saque: ");
				System.out.println();
				valorOperacao = sc.nextDouble();
			} else {
				System.out.println();
				System.out.println("Digite o valor para depósito: ");
				System.out.println();
				valorOperacao = sc.nextDouble();
			}
			System.out.println();
			System.out.println("=================================================================");
			System.out.println();

			
			
				
			
			ContaBancaria conta;
			if (tipoConta == 1) {
				conta = new ContaCorrente(numeroConta, saldoInicial, 10);
			} else {
				conta = new ContaPoupanca(numeroConta, saldoInicial, 0.05);
			}
				
				
							
			if (operacao == 1) {
				conta.sacar(valorOperacao);
				System.out.println();
				System.out.println("Saque realizado com sucesso!");
				System.out.println();
				System.out.println("=================================================================");
			} else {
				conta.depositar(valorOperacao);
				System.out.println();
				System.out.println("Depósito realizado com sucesso!");
				System.out.println();
				System.out.println("=================================================================");
			}
			
			System.out.println();
			System.out.println("Saldo atual: R$" + conta.getSaldo());
			System.out.println();
			System.out.println("=================================================================");
			
			System.out.println();
			System.out.println("Deseja realizar outra operação? (S/N)");
			System.out.println();
			System.out.println("=================================================================");
			System.out.println();

			 String resp = sc.next();
			 if (resp.equals("n")) {
				 System.out.println();
				 System.out.println("Fim da operação.");
				 System.out.println();
				 System.out.println("=================================================================");
				 
				 continuar = false;
			 }
			 sc.nextLine();
	
		}
		
		sc.close();
	
	}
}
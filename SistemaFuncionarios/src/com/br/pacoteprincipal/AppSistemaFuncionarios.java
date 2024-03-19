package com.br.pacoteprincipal;

public class AppSistemaFuncionarios {

	public static void main(String[] args) {
		
		
		Funcionario prog = new Programador("Pedro", 3000);
		Funcionario ger = new Gerente("Jean", 5000, 2);
		
		
		System.out.println("Funcionário: " + prog.getNome());
		System.out.println("Salário: " + prog.getSalario());
		System.out.println("Salário com bônus: " + (prog.getSalario() + prog.calcularBonus()));
		System.out.println();
		System.out.println("=================================================================");
		System.out.println();
		System.out.println("Funcionário: " + ger.getNome());
		System.out.println("Salário: " + ger.getSalario());
		System.out.println("Salário com bônus: " + (ger.getSalario() + ger.calcularBonus()));
		System.out.println();
		System.out.println("=================================================================");
		
	}
}

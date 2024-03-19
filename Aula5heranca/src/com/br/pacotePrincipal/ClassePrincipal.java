package com.br.pacotePrincipal;

public class ClassePrincipal {

	public static void main(String[] args) {
		
//		Secretaria s = new Secretaria();	
//		s.nome = "Maria";
//		s.idade = 40;
//		s.dados();
		
		
		Pessoa p = new Secretaria();		
		p.nome = "Bia";
		p.idade = 23;
		p.dados();
		System.out.println("Salário: " + p.salario());
		
		Professor prof = new Professor();
		prof.nome = "Carlos";
		prof.idade = 45;
		prof.dados();		
		System.out.println("Salário: " + prof.salario());
		
		Porteiro b = new Porteiro();
		b.nome = "João";
		b.idade = 49;
		b.dados();		
		System.out.println("Salário: " + b.salario());
		
	}

}
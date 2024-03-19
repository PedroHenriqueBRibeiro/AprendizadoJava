package com.br.pacotePrincipal;

public abstract class Pessoa {

	public String nome;
	public int idade;
	
	public void dados() {
		
		System.out.println("Nome: "+ this.nome);
		System.out.println("Idade: "+ this.idade);
	}
	
	public abstract int salario();
}

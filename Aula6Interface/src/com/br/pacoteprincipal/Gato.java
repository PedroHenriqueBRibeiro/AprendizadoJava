package com.br.pacoteprincipal;

public class Gato implements Animal{
	
	@Override
	public void fazerSom() {
		System.out.println("O gato faz: miau!!!");
	}
	
	@Override
	public void correr () {
		System.out.println("O gato gosta de correr e pular muros!!!");
	}

}

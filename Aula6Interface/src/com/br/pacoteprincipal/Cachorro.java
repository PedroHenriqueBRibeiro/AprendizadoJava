package com.br.pacoteprincipal;

public class Cachorro implements Animal{
	
	
	@Override
	public void fazerSom() {
		System.out.println("Latindo: Au Au!!!");
	}

	@Override
	public void correr() {
		System.out.println("O cachorro corre com as 4 patas.... hehe!!!");
	}

}

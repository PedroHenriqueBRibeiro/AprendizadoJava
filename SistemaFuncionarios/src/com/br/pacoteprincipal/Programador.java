package com.br.pacoteprincipal;

	class Programador extends Funcionario{
	public Programador(String nome, double salario) {
		super(nome, salario);
	}
	
	@Override
	public double calcularBonus() {
		return 550;
	}

}

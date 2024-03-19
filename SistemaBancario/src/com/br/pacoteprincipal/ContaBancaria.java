package com.br.pacoteprincipal;

abstract class ContaBancaria {
	protected String numeroConta;
	protected double saldo;
	
	public ContaBancaria(String numeroConta, double saldoInicial) {
		this.numeroConta = numeroConta;
		this.saldo = saldoInicial;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	public abstract void sacar (double valor);

}

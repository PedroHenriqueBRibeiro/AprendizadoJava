package com.br.pacoteprincipal;

class ContaPoupanca extends ContaBancaria{
	private double taxaRendimento;
	
	public ContaPoupanca(String numeroConta, double saldoInicial, double taxaRendimento) {
		super(numeroConta, saldoInicial);
		this.taxaRendimento = taxaRendimento;
	}
	
	public double getTaxaRendimento() {
		return taxaRendimento;
	}
	
	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}
	
	@Override
	public void sacar(double valor) {
		saldo = saldo - valor;
	}
	
	public void aplicarRendimento() {
		saldo = saldo * (1 + taxaRendimento);
	}

}

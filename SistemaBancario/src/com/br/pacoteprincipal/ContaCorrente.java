package com.br.pacoteprincipal;

class ContaCorrente extends ContaBancaria{
	private double taxaManutencao;
	
	public ContaCorrente(String numeroConta, double saldoInicial, double taxaManutencao) {
		super(numeroConta, saldoInicial);
        this.taxaManutencao = taxaManutencao;
	}
	
	public double getTaxaManutencao() {
		return taxaManutencao;
	}
	
	public void setTaxaManutencao(double taxaManutencao) {
		this.taxaManutencao = taxaManutencao;
	}
	
	@Override
	public void sacar(double valor) {
		saldo = saldo - valor;
		saldo = saldo - taxaManutencao;
	}

}

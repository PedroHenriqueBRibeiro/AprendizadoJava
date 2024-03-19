package com.br.pacoteprincipal;

	class Gerente extends Funcionario{
		private int numeroSubordinados;
		
		public Gerente(String nome, double salario, int numeroSubordinados) {
			super(nome, salario);
			this.numeroSubordinados = numeroSubordinados;
		}

		public int getNumeroSubordinados() {
			return numeroSubordinados;
		}

		public void setNumeroSubordinados(int numeroSubordinados) {
			this.numeroSubordinados = numeroSubordinados;
		}
		
		@Override
		public double calcularBonus() {
			return getSalario() * 0.01 * numeroSubordinados;
		}
}

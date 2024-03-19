package com.br.pacoteEx1;

public class Triangulo implements FormaGeometrica{
	private double lado1;
	private double lado2;
	private double lado3;
	
	public Triangulo(double lado1, double lado2, double lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
	@Override
	public double calcularArea() {
		double semiPerimetro = (lado1 + lado2 + lado3) / 2;
		return Math.sqrt(semiPerimetro * (semiPerimetro - lado1) * (semiPerimetro - lado2) * (semiPerimetro - lado3));
	}

	@Override
	public double calcularPerimetro() {
		return lado1 + lado2 + lado3;
	}
}


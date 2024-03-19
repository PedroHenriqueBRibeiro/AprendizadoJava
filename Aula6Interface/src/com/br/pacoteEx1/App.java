package com.br.pacoteEx1;

public class App {

	public static void main(String[] args) {
		
		Triangulo t = new Triangulo(3, 4, 5);
		t.calcularArea();
		t.calcularPerimetro();
		
		double areaT = t.calcularArea();
		double perimetroT = t.calcularPerimetro();
		System.out.println("Área do triângulo: " + areaT);
		System.out.println("Perímetro do triângulo: " + perimetroT);
		System.out.println("###############################################");
		
		Quadrado q = new Quadrado(4);
		q.calcularArea();
		q.calcularPerimetro();
		
		double areaQ = q.calcularArea();
		double perimetroQ = q.calcularPerimetro();
		System.out.println("Área do quadrado: " + areaQ);
		System.out.println("Perímetro do quadrado: " + perimetroQ);
		System.out.println("###############################################");
		
		Circulo c = new Circulo(5);
		c.calcularArea();
		c.calcularPerimetro();
		
		double areaC = c.calcularArea();
		double perimetroC = c.calcularPerimetro();
		System.out.println("Área do círculo: " + areaC);
		System.out.println("Perímetro do círculo: " + perimetroC);
		System.out.println("###############################################");
		
	

	}
}
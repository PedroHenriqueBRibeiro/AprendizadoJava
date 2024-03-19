package com.br.pacoteprincipal;

public class Ex3 {

	public static void main(String[] args) {
	try {
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		System.out.println("Fim!");
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
}
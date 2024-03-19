package com.br.pacote;

public class ClassePrincipal {

	public static void main(String[] args) {
		
		
		//Carro

			Carro c = new Carro();
			c.setModelo("Ferrari");
			c.setAno(2005);
	
			System.out.println("Modelo do carro: " + c.getModelo());
			System.out.println("Ano do carro: " + c.getAno());
			System.out.println();
			
		//Circulo
			
			
			
			Circulo circulo = new Circulo();
			circulo.setRaio(20);
	
			System.out.println("Raio do círculo " + circulo.getRaio());
			System.out.println();
			
			
		//Conta Bancaria
			
			
			
			ContaBancaria conta = new ContaBancaria();
			conta.setSaldo(2400);
	
			System.out.println("Saldo na conta: " + conta.getSaldo());
			System.out.println();
			
			
		//Estudante
			
			
			
			Estudante est = new Estudante();
			est.setNome("Pedro");
			est.setIdade(22);
			est.setCurso("Desenvolvedor");
	
			System.out.println("Nome: " + est.getNome());
			System.out.println("Idade: " + est.getIdade());
			System.out.println("Curso: " + est.getCurso());
			System.out.println();
			
			
			
			
		//Livro
			
			
			Livro l = new Livro();
			l.setTitulo("Meu Livro");
			l.setAutor("Carlos");
	
			System.out.println("Título: " + l.getTitulo());
			System.out.println("Autor: " + l.getAutor());
			System.out.println();
			
			
			
		//Pessoa
			
			
			Pessoa p = new Pessoa();
			p.setNome("João");
			p.setIdade(18);
	
			System.out.println("Nome: " + p.getNome());
			System.out.println("Idade: " + p.getIdade());
			System.out.println();
			
			
			
		//Produto
			
			
			Produto prod = new Produto();
			prod.setNome("Arroz");
			prod.setPreco(29.95);
	
			System.out.println("Produto: " + prod.getNome());
			System.out.println("Preço: R$" + prod.getPreco());
			System.out.println();
			
			
			
		//Telefone
			
			
			
			Telefone tel = new Telefone();
			tel.setNumero(999991234);
			tel.setOperadora("Cloro");
	
			System.out.println("Número: " + tel.getNumero());
			System.out.println("Operadora: " + tel.getOperadora());
			System.out.println();

		}

	}


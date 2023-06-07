<<<<<<< HEAD
package br.alchieri;

public class Pessoa {

	private String nome;
	private int idade;
	private double altura;
	private double peso;
	
	public Pessoa(String nome, int idade, 
			double altura, double peso) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
	}
	
	public double calcularImc() {
		double imc = peso/(altura*altura);
		return imc;
	}
=======
package br.alchieri;

public class Pessoa {

	private String nome;
	private int idade;
	private double altura;
	private double peso;
	
	public Pessoa(String nome, int idade, 
			double altura, double peso) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
	}
	
	public double calcularImc() {
		double imc = peso/(altura*altura);
		return imc;
	}
>>>>>>> 0033798148f2d50ba623bde7aa2bcc5d332b46a1
}
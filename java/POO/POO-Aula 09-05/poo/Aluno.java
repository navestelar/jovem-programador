package br.alchieri;

public class Aluno extends Pessoa {

	private String matricula;
	
	public Aluno(String nome, int idade, 
			double altura, double peso, String matricula) {
		
		super(nome, idade, altura, peso);
		this.matricula = matricula;
	}
	
	@Override
	public double calcularImc() {
		
		return 1.2;
	}
}

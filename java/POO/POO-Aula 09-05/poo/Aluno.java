<<<<<<< HEAD
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
=======
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
>>>>>>> 0033798148f2d50ba623bde7aa2bcc5d332b46a1

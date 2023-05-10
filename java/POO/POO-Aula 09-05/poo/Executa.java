package br.alchieri;

public class Executa {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("João", 25, 1.75, 70);
		Aluno a = new Aluno("Maria", 20, 1.65, 60, "001");
		
		System.out.println(pessoa1.calcularImc());
		System.out.println(a.calcularImc());
		
		Calculadora calc = new Calculadora();
		System.out.println(calc.soma(2, 3));
		System.out.println(calc.soma(2.5, 3));
		System.out.println(calc.soma(2.5, 3.5));
		
		Animal animal1 = new Cachorro();
		Animal animal2 = new Gato();
				
		animal1.emitirSom();
		animal2.emitirSom();
		animal1.dormir();
		animal2.dormir();
				
		Carro carro = new Carro();
			
		carro.acelerar();
		
		Moto moto = new Moto();
		
		moto.acelerar();
		
		moto.frear();
	}
}

package main;

import java.util.Scanner;

public abstract class ManipulaSubMenu {

	protected Scanner scanner = new Scanner(System.in);
	
	public abstract void listar();
	
	public abstract void cadastrar();
	
	public abstract void atualizar();
	
	public abstract void excluir();
	
	protected String formatarString(String texto, 
			int tamanho, String preenchimento) {
		
		int tamanhoDesejado = tamanho;
		int espacoEmBranco = tamanhoDesejado - 
				texto.length();
		
		if (espacoEmBranco > 0) {
			StringBuilder builder = new StringBuilder(texto);
			for (int i = 0; i < espacoEmBranco; i++) {
				builder.append(preenchimento);
			}
			return builder.toString();
		} else {
			return texto;
		}
	}
}
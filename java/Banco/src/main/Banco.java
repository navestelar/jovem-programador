package main;

import java.util.Scanner;

public class Banco {
	
	private Scanner scanner = new Scanner(System.in);
	int opcao;

	public void menu() {
		
		Scanner menu = new Scanner(System.in);
		
		do {
			System.out.println("MENU:");
			System.out.println("1 - Cadastro de Cliente.");
			System.out.println("2 - Cadastro de C.C.");
			System.out.println("3 - Cadastro de C.P.");
			System.out.println("4 - Sacar.");
			System.out.println("5 - Depositar.");
			System.out.println("0 - Sair.");
			System.out.print("Escolha uma opção: ");
			opcao = menu.nextInt();
			
			switch (opcao) {
				case 1:
					System.out.println("Cadastro de Cliente:");
					menuCliente();
					break;
				case 2:
					System.out.println("Cadastro de Conta Corrente:");
					menuContaCorrente();
					break;
				case 3:
					System.out.println("Cadastro de Conta Poupança:");
					break;
				case 4:
					System.out.println("Realizar Saque:");
					break;
				case 5:
					System.out.println("Realizar Deposito:");
					break;
				case 0:
					System.out.println("Saindo do programa...");
					break;
				default:
					System.out.println("Opção inválida. Por favor, escolha novamente.");
					break;
			}
			System.out.println();
		} while (opcao != 0);
	}
	
	private void menuContaCorrente() {

		ManipulaContaCorrente manipulaContaCorrente = new ManipulaContaCorrente();
		do {
			subMenu();
			opcao = scanner.nextInt();
			switch (opcao) {
				case 1:
					manipulaContaCorrente.listar();
					break;
				case 2:
					manipulaContaCorrente.cadastrar();
					break;
				case 3:
					manipulaContaCorrente.atualizar();
					break;
				case 4:
					manipulaContaCorrente.excluir();
					break;
				case 0:
					menu();
					break;
				default:
					System.out.println("Opção inválida. Por favor, escolha novamente.");
			}
		} while (true);
	}

	private void menuCliente() {
		
		ManipulaCliente manipulaCliente = new ManipulaCliente();
		do {
			subMenu();
			opcao = scanner.nextInt();
			switch (opcao) {
				case 1:
					manipulaCliente.listar();
					break;
				case 2:
					manipulaCliente.cadastrar();
					break;
				case 3:
					manipulaCliente.atualizar();
					break;
				case 4:
					manipulaCliente.excluir();
					break;
				case 0:
					menu();
					break;
				default:
					System.out.println("Opção inválida. Por favor, escolha novamente.");
			}
		} while (true);
	}

	private void subMenu() {
		System.out.println("1 - Listar.");
		System.out.println("2 - Cadastrar.");
		System.out.println("3 - Atualizar.");
		System.out.println("4 - Excluir.");
		System.out.println("0 - Retornar menu principal.");
		System.out.print("Escolha uma opção: ");
	}
}

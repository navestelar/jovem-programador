package main;

import java.util.ArrayList;
import java.util.List;

import banco.ContaCorrente;
import dao.ContaDAO;

public class ManipulaContaCorrente extends ManipulaSubMenu {

	private ContaDAO dao = new ContaDAO();
	private List<ContaCorrente> contas;
	private ContaCorrente conta;
	
	@Override
	public void listar() {
		
		String cabecalho = "+-"+formatarString("", 10, "-")
				+"-+-"+formatarString("", 20, "-")
				+"-+-"+formatarString("", 20, "-")
				+"-+-"+formatarString("", 20, "-")
				+"-+";

		System.out.println(cabecalho);
		
		System.out.println("| "+formatarString("Nº C.C", 10, " ")
				+" | "+formatarString("Saldo", 20, " ")
				+" | "+formatarString("Proprietário", 20, " ")
				+" | "+formatarString("Limite", 20, " ")
				+" |");
		
		System.out.println(cabecalho);
		
		for (ContaCorrente c : dao.recuperarContaCorrente()) {
			System.out.println("| "+
				formatarString(String.valueOf(c.getNumeroConta()), 10, " ")
				+" | "+formatarString(String.valueOf(c.getSaldo()), 20, " ")
				+" | "+formatarString(c.getProprietario().getNome(), 20, " ")
				+" | "+formatarString(String.valueOf(c.getLimite()), 20, " ")
				+" |");
		}
		System.out.println(cabecalho);
	}

	@Override
	public void cadastrar() {

		int numeroConta;
		double saldo;
		int proprietario;
		double limite;
		contas = new ArrayList<>();
		contas = dao.recuperarContaCorrente();
		System.out.print("Número da Conta: ");
		numeroConta = scanner.nextInt();
		System.out.println("Saldo: ");
		saldo = scanner.nextDouble();
		System.out.println("ID do proprietário: ");
		proprietario = scanner.nextInt();
		System.out.println("Limite da Conta: ");
		limite = scanner.nextDouble();
		conta = new ContaCorrente(numeroConta, saldo, 
				proprietario, limite);
		contas.add(conta);
		dao.salvarContaCorrente(contas);
	}

	@Override
	public void atualizar() {
		
		System.out.println("Número da conta: ");
		conta = dao.consultaContaCorrente(scanner.nextInt());
		System.out.println("O limite atual é: "
				+conta.getLimite());
		System.out.println("O limite a ser atualizado é: ");
		conta.setLimite(scanner.nextDouble());
		dao.atualizarLimite(conta);
	}

	@Override
	public void excluir() {

		System.out.println("Número da conta: ");
		dao.excluirConta(scanner.nextInt(), "cc");
		scanner.nextLine();
		System.out.println("Conta excluída com sucesso!");
	}
}
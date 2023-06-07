package main;

import java.util.ArrayList;
import java.util.List;

import banco.Cliente;
import banco.ContaCorrente;
import banco.ContaPoupanca;
import dao.ClienteDAO;
import dao.ContaDAO;

public class Banco {

	public static void main(String[] args) {
		
		manipulaClientes();
		manipulaContas();
	}
	
	private static void manipulaContas() {
		/*
		 * Criar 3 contas correntes
		 * Criar 3 contas poupanças
		 * Alterar o limite de 1 conta corrente.
		 * Alterar a taxa de juros de 1 conta poupança.
		 * Sacar valor acima do limite e saldo de uma conta corrente.
		 * Sacar valor abaixo do limite e saldo de uma conta corrente.
		 * Sacar valor acima do saldo de uma conta poupança.
		 * Sacar valor abaixo do saldo de uma conta poupança.
		 * Depositar em uma conta corrente.
		 * Depositar em uma conta poupança.
		 * Atualizar saldo com base nos juros em uma conta poupança.
		 * Criar mais uma conta corrente e outra conta poupança.
		 * Excluir uma conta corrente e outra conta poupança.
		 * Atualizar limite de uma conta corrente.
		 * Atualizar Taxa de juros de uma conta poupança.
		 */

		List<ContaCorrente> correntes = new ArrayList<>();
		ContaCorrente contaCorrente1 = new ContaCorrente(1, 1000, 1, 500);
		ContaCorrente contaCorrente2 = new ContaCorrente(2, 2000, 2, 1000);
		ContaCorrente contaCorrente3 = new ContaCorrente(3, 3000, 3, 1500);
		correntes.add(0, contaCorrente1);
		correntes.add(1, contaCorrente2);
		correntes.add(2, contaCorrente3);

		ContaDAO dao = new ContaDAO();
		dao.salvarContaCorrente(correntes);

		List<ContaPoupanca> poupancas = new ArrayList<>();
		ContaPoupanca contaPoupanca1 = new ContaPoupanca(1, 1000, 1, 0.01);
		ContaPoupanca contaPoupanca2 = new ContaPoupanca(2, 2000, 2, 0.02);
		ContaPoupanca contaPoupanca3 = new ContaPoupanca(3, 3000, 3, 0.03);

		dao.salvarContaPoupanca(poupancas);

		poupancas.add(0, contaPoupanca1);
		poupancas.add(1, contaPoupanca2);
		poupancas.add(2, contaPoupanca3);
		contaCorrente1.setLimite(1000);
		contaPoupanca1.setTaxaJuros(0.1);
		contaCorrente2.sacar(5000);
		contaCorrente3.sacar(1500);
		contaPoupanca2.sacar(5000);
		contaPoupanca3.sacar(1500);
		contaCorrente1.depositar(1000);
		contaPoupanca1.depositar(1000);
		contaPoupanca3.atualizarSaldoBaseJuro();
		ContaCorrente contaCorrente4 = new ContaCorrente(4, 4000, 4, 2000);
		correntes.add(3, contaCorrente4);
		ContaPoupanca contaPoupanca4 = new ContaPoupanca(4, 4000, 4, 0.04);
		poupancas.add(3, contaPoupanca4);
		contaCorrente1.setLimite(2000);
		System.out.println(contaPoupanca3.getSaldo());
		
		
	}

	public static void manipulaClientes() {
		List<Cliente> clientes = new ArrayList<>();
		
		Cliente cliente = new Cliente(1, "Jorge", "Rua das couves, 78");
		Cliente cli2 = new Cliente(2, "Pedro", "Rua Brasil, 123 - Sumaré - Rio do Sul");
		Cliente cli3 = new Cliente(3, "Maria", "Rua Coiso, 23");
		clientes.add(cliente);
		clientes.add(cli2);
		clientes.add(cli3);
		
		ClienteDAO clienteDAO = new ClienteDAO();
		clienteDAO.salvar(clientes);
		
		clientes = clienteDAO.excluirCliente(2);
		clientes = clienteDAO.excluirCliente(6);
		
		Cliente cli4 = new Cliente(4, "Ana", "Rua 1");
		clientes.add(cli4);
		clienteDAO.salvar(clientes);
		
		cli3.setEndereco("Rua Paraná, 321");
		clienteDAO.atualizarCliente(cli3);
		
		List<Cliente> clientesRetorno = new ArrayList<>();
		clientesRetorno = clienteDAO.recuperar();
		
		for (Cliente c : clientesRetorno) {
			System.out.println("ID: "+c.getId());
			System.out.println("Nome: "+c.getNome());
			System.out.println("Endereço: "+c.getEndereco());
			System.out.println();
		}
		System.out.println("Executou");
	}
}

package main;

import java.util.ArrayList;
import java.util.List;

import banco.Cliente;
import dao.ClienteDAO;

public class ManipulaCliente extends ManipulaSubMenu {

	private ClienteDAO dao = new ClienteDAO();
	private List<Cliente> clientes;
	private Cliente cliente;
	
	@Override
	public void listar() {

		String cabecalho = "+-"+formatarString("", 4, "-")
				+"-+-"+formatarString("", 70, "-")
				+"-+-"+formatarString("", 70, "-")
				+"-+";
	
		System.out.println(cabecalho);
		
		System.out.println("| "+formatarString("ID", 4, " ")
				+" | "+formatarString("Nome", 70, " ")
				+" | "+formatarString("Endereço", 70, " ")
				+" |");
		
		System.out.println(cabecalho);
		
		for (Cliente c : dao.recuperar()) {
			System.out.println("| "+
					formatarString(String.valueOf(c.getId()), 4, " ")
					+" | "+formatarString(c.getNome(), 70, " ")
					+" | "+formatarString(c.getEndereco(), 70, " ")
					+" |");
		}
		System.out.println(cabecalho);
	}

	@Override
	public void cadastrar() {

		clientes = new ArrayList<>();
		clientes = dao.recuperar();
		cliente = new Cliente();
		System.out.print("ID: ");
		cliente.setId(scanner.nextInt());
		scanner.nextLine();
		System.out.print("Nome: ");
		cliente.setNome(scanner.nextLine());
		System.out.print("Endereço: ");
		cliente.setEndereco(scanner.nextLine());
		clientes.add(cliente);
		dao.salvar(clientes);
		System.out.println("Cliente "+
				cliente.getNome()+
				" salvo com sucesso!");
	}

	@Override
	public void atualizar() {
		
		cliente = new Cliente();
		System.out.println("Id cliente: ");
		cliente = dao.consultar(scanner.nextInt());
		scanner.nextLine();
		System.out.println(cliente.getId());
		System.out.println(cliente.getNome());
		System.out.print("Novo endereço: ");
		cliente.setEndereco(scanner.nextLine());
		dao.atualizarCliente(cliente);
	}

	@Override
	public void excluir() {

		System.out.print("Id cliente: ");
		dao.excluirCliente(scanner.nextInt());
		scanner.nextLine();
		System.out.println("Cliente excluido com sucesso!");
	}
}
package banco;

import dao.ClienteDAO;

public abstract class Conta {

	private int numeroConta;
	private double saldo;
	private Cliente proprietario;
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public Cliente getProprietario() {
		return proprietario;
	}
	
	public void setProprietario(Cliente proprietario) {
		this.proprietario = proprietario;
	}
	
	public void setProprietario(int idCliente) {
		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente cliente = clienteDAO.consultar(idCliente);
		setProprietario(cliente);
	}
	
	public abstract void depositar(double valor);
	
	public abstract boolean sacar(double valor);
	
	public String toString() {
		return "Conta: "+numeroConta+
				", titular: "+proprietario.getNome()+
				", saldo: "+saldo;
	}
}
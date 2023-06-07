package banco;

public class ContaCorrente extends Conta {

	private double limite;
	
	public ContaCorrente(int numeroConta, double saldo, 
			int proprietario, double limite) {
		setNumeroConta(numeroConta);
		setSaldo(saldo);
		setProprietario(proprietario);
		setLimite(limite);
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
}
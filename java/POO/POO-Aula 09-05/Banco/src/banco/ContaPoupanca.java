package banco;

public class ContaPoupanca extends Conta {

	private double taxaJuros;
	
	public ContaPoupanca(int numeroConta, double saldo, 
			int proprietario, double taxaJuros) {
		setNumeroConta(numeroConta);
		setSaldo(saldo);
		setProprietario(proprietario);
		setTaxaJuros(taxaJuros);
	}

	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	@Override
	public void depositar(double valor) {
		setSaldo(getSaldo()+valor);
	}

	@Override
	public boolean sacar(double valor) {

		if (valor > getSaldo()) {
			return false;
		}
		setSaldo(getSaldo()-valor);
		return true;
	}
	
	public void atualizarSaldoBaseJuro() {
		setSaldo((getSaldo()*taxaJuros)+getSaldo());
	}
}

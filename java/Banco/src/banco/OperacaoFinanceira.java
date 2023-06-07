package banco;

public abstract class OperacaoFinanceira {

	private double valor;
	private String descricao;
	
	public abstract void operacao();
}

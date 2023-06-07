package conta;

public class ContaPoupanca extends Conta {
    private double rendimento;

    public ContaPoupanca(String titular, int numeroDaConta, String agencia, double saldo, double rendimento) {
        super(titular, numeroDaConta, agencia, saldo);
        this.rendimento = rendimento;
    }

    public void mostrarInformações(){
        System.out.println("Conta Poupança");
        System.out.println("Titular: "+this.getTitular());
        System.out.println("Número da conta: "+this.getNumeroDaConta());
        System.out.println("Agência: "+this.getAgencia());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Rendimento: "+this.getRendimento());
        System.out.println("---------------------------------------");
    }
    
    public double getRendimento() {
        return rendimento;
    }
}

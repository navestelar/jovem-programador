package conta;

public class Conta {
    private String titular;
    private int numeroDaConta;
    private String agencia;
    private double saldo;

    
    public Conta(String titular, int numeroDaConta, String agencia, double saldo) {
        this.titular = titular;
        this.numeroDaConta = numeroDaConta;
        this.agencia = agencia;
        this.saldo = saldo;
    }
    
    public void mostrarInformações(){
        System.out.println("Conta");
        System.out.println("Titular: "+this.getTitular());
        System.out.println("Número da conta: "+this.getNumeroDaConta());
        System.out.println("Agência: "+this.getAgencia());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("---------------------------------------");
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        if(this.getSaldo()>=valor){
            setSaldo(this.getSaldo()-valor);
        }else {
            System.out.println("Saldo insuficiente");
        }
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getTitular() {
        return titular;
    }
    public int getNumeroDaConta() {
        return numeroDaConta;
    }
    public String getAgencia() {
        return agencia;
    }
    public double getSaldo() {
        return saldo;
    }
}

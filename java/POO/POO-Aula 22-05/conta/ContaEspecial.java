package conta;

public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(String titular, int numeroDaConta, String agencia, double saldo, double limite) {
        super(titular, numeroDaConta, agencia, saldo);
        this.limite = limite;
    }

    public void mostrarInformações(){
        System.out.println("Conta");
        System.out.println("Titular: "+this.getTitular());
        System.out.println("Número da conta: "+this.getNumeroDaConta());
        System.out.println("Agência: "+this.getAgencia());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Limite: "+this.getLimite());
        System.out.println("---------------------------------------");
    }

    public void sacar(double valor){
        if(((this.getSaldo()+this.getLimite())>=valor)){
            setSaldo(this.getSaldo()-valor);
        }else {
            System.out.println("Saldo insuficiente");
        }
    }
    
    public double getLimite() {
        return limite;
    }
}

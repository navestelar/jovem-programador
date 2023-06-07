<<<<<<< HEAD
package conta;

public class ContaCorrente {
    private float saldo;

    public void definirSaldoInicial(float valor) {
        saldo = valor;
    }

    public void depositar(float valor) {
        saldo += valor;
    }

    public boolean sacar(float valor) {
        if (saldo>=valor){
            saldo -= valor;
            return true;
        }else {
            System.out.println("Saldo insuficiente");
            return false;
        }
    }
    
    public static void main(String[] args) {
        ContaCorrente novaConta = new ContaCorrente();
        novaConta.definirSaldoInicial(1000);
        System.out.println(novaConta.saldo);
        novaConta.sacar(500);
        novaConta.depositar(50);
        System.out.println(novaConta.saldo);
        novaConta.sacar(600);
        System.out.println(novaConta.saldo);
        System.out.println(novaConta.sacar(600));
    }
}
=======
package conta;

public class ContaCorrente {
    private float saldo;

    public void definirSaldoInicial(float valor) {
        saldo = valor;
    }

    public void depositar(float valor) {
        saldo += valor;
    }

    public boolean sacar(float valor) {
        if (saldo>=valor){
            saldo -= valor;
            return true;
        }else {
            System.out.println("Saldo insuficiente");
            return false;
        }
    }
    
    public static void main(String[] args) {
        ContaCorrente novaConta = new ContaCorrente();
        novaConta.definirSaldoInicial(1000);
        System.out.println(novaConta.saldo);
        novaConta.sacar(500);
        novaConta.depositar(50);
        System.out.println(novaConta.saldo);
        novaConta.sacar(600);
        System.out.println(novaConta.saldo);
        System.out.println(novaConta.sacar(600));
    }
}
>>>>>>> 0033798148f2d50ba623bde7aa2bcc5d332b46a1

public class Conta {
    private int agencia;
    private int numero;
    private String titular;
    private double saldo;
    
    public Conta(int agencia, int numero, String titular, double saldo){
        this.setAgencia(agencia);
        this.setNumero(numero);
        this.setTitular(titular);
        this.setSaldo(saldo);
    }
    
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

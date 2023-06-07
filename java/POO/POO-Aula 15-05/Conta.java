public class Conta {
    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private String dataDeAbertura;
    
    public Conta(String titular, int numero, String agencia, double saldo, String dataDeAbertura){
        setTitular(titular);
        setNumero(numero);
        setAgencia(agencia);
        setSaldo(saldo);
        setDataDeAbertura(dataDeAbertura);
    }
    
    public void depositar(double valor) {
        setSaldo(getSaldo()+valor);
	}
    
    public void sacar(double valor) {
        setSaldo(getSaldo()-valor);
    }
    
    public void calculaRendimento(){
        setSaldo(getSaldo()*0.1);
    }
    
    public String recuperaDadosParaImpressao(){
        return "Titular: "+titular+"\nNúmero: "+numero+"\nAgência: "+agencia+"\nSaldo: "+saldo+"\nData de abertura: "+dataDeAbertura;
    }
    
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getDataDeAbertura() {
        return dataDeAbertura;
    }
    public void setDataDeAbertura(String dataDeAbertura) {
        this.dataDeAbertura = dataDeAbertura;
    }
}

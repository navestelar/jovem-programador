package funcionarios;

public class Mensalista extends Funcionario {
    private double salarioFixo;

    public Mensalista(String nome, double salarioFixo) {
        super(nome);
        this.salarioFixo = salarioFixo;
    }

    public void mostrarInformacoes(){
        System.out.println("Nome: "+this.getNome());
        System.out.println("Salário fixo: "+this.getSalarioFixo());
        System.out.println("---------------------------------------------");
    }
    
    public double getSalarioFixo() {
        return salarioFixo;
    }
}

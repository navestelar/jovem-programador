package funcionarios;

public class Horista extends Funcionario{
    private int numeroDeHorasTrabalhadas;
    private double salarioPORh;
    
    public Horista(String nome, int numeroDeHorasTrabalhadas, double salarioPORh) {
        super(nome);
        this.numeroDeHorasTrabalhadas = numeroDeHorasTrabalhadas;
        this.salarioPORh = salarioPORh;
    }
    
    public void mostrarInformacoes(){
        System.out.println("Nome: "+this.getNome());
        System.out.println("Número de horas trabalhadas: "+this.numeroDeHorasTrabalhadas);
        System.out.println("salario/h: "+this.getSalarioPORh());
        System.out.println("---------------------------------------------");
    }
    
    public double getSalarioPORh() {
        return salarioPORh;
    }
    public int getNumeroDeHorasTrabalhadas() {
        return numeroDeHorasTrabalhadas;
    }
}

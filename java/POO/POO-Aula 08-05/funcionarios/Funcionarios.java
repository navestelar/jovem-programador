package funcionarios;

public class Funcionarios {
    private String nome;
    private String sobrenome;
    private int horasTrabalhadas;
    private double valorPorHora;

    public String nomeCompleto() {
        return nome+" "+sobrenome;
    }

    public double calcularSalario(){
        return horasTrabalhadas*valorPorHora;
    }

    public void incrementarHoras(int valor){
        valorPorHora += valor;
    }

    public static void main(String[] args) {
        Funcionarios novoFuncionario = new Funcionarios();
        novoFuncionario.nome = "Luis";
        novoFuncionario.sobrenome = "Silva";
        novoFuncionario.horasTrabalhadas = 10;
        novoFuncionario.valorPorHora = 25.50;
        System.out.println(novoFuncionario.nomeCompleto());
        System.out.println(novoFuncionario.calcularSalario());
        novoFuncionario.incrementarHoras(8);
        System.out.println(novoFuncionario.calcularSalario());
    }
}

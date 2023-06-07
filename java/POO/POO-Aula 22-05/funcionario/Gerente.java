package funcionario;

public class Gerente extends Funcionario {
    private String areaDeAtuacao;

    public Gerente(String nome, int idade, double salario, String areaDeAtuacao) {
        super(nome, idade, salario);
        this.areaDeAtuacao = areaDeAtuacao;
    }

    public void mostrarInformações() {
        System.out.println("Funcionário");
        System.out.println("Nome: "+this.getNome());
        System.out.println("Idade: "+this.getIdade());
        System.out.println("Salário: "+this.getSalario());
        System.out.println("Área de atuação: "+this.getAreaDeAtuacao());
        System.out.println("-----------------------------------------------------");
    }

    public String getAreaDeAtuacao() {
        return areaDeAtuacao;
    }
}

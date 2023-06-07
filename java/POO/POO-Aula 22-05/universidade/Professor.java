package universidade;
public class Professor extends Funcionario {
    private String disciplina;

    
    public Professor(String nome, int idade, double salario, String disciplina) {
        super(nome, idade, salario);
        this.disciplina=disciplina;
    }
    
    public void mostrarInformações() {
        System.out.println("Professor");
        System.out.println("Nome: "+this.getNome());
        System.out.println("Idade: "+this.getIdade());
        System.out.println("Salário: "+this.getSalario());
        System.out.println("Disciplina: "+this.getDisciplina());
        System.out.println("-----------------------------------------------------");
    }

    public String getDisciplina() {
        return disciplina;
    }
}

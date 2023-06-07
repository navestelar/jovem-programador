package universidade;
public class Administrativo extends Funcionario {
    private String setor;

    public Administrativo(String nome, int idade, double salario, String setor) {
        super(nome, idade, salario);
        this.setor=setor;
    }

    public void mostrarInformações() {
        System.out.println("Administrativo");
        System.out.println("Nome: "+this.getNome());
        System.out.println("Idade: "+this.getIdade());
        System.out.println("Salário: "+this.getSalario());
        System.out.println("Setor: "+this.getSetor());
        System.out.println("-----------------------------------------------------");
    }
    
    public String getSetor() {
        return setor;
    }
}

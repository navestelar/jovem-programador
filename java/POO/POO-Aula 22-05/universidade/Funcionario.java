package universidade;
class Funcionario {
    private String nome;
    private int idade;
    private double salario;
    
    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public void mostrarInformações() {
        System.out.println("Funcionário");
        System.out.println("Nome: "+this.getNome());
        System.out.println("Idade: "+this.getIdade());
        System.out.println("Salário: "+this.getSalario());
        System.out.println("-----------------------------------------------------");
    }
    
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public double getSalario() {
        return salario;
    }
}
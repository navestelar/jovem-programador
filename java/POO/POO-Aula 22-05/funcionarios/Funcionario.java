package funcionarios;

public class Funcionario {
    private String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public void mostrarInformacoes(){
        System.out.println("Nome: "+this.getNome());
        System.out.println("---------------------------------------------");
    }
    
    public String getNome() {
        return nome;
    }
}

package funcionario;

public class Vendedor extends Funcionario {
    private int metaDeVendas;

    public Vendedor(String nome, int idade, double salario, int metaDeVendas) {
        super(nome, idade, salario);
        this.metaDeVendas = metaDeVendas;
    }

    public void mostrarInformações() {
        System.out.println("Funcionário");
        System.out.println("Nome: "+this.getNome());
        System.out.println("Idade: "+this.getIdade());
        System.out.println("Salário: "+this.getSalario());
        System.out.println("Meta de Vendas: "+this.getMetaDeVendas());
        System.out.println("-----------------------------------------------------");
    }
    
    public int getMetaDeVendas() {
        return metaDeVendas;
    }
}

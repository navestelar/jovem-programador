package agenda_de_contatos;

public class Telefonico extends Contatos {
    private double numero;

    public Telefonico(String nome, double numero) {
        super(nome);
        this.numero = numero;
    }

    public void mostrarInformacoes() {
        System.out.println("Contatos");
        System.out.println("Nome: "+this.getNome());
        System.out.println("Número: "+this.getNumero());
        System.out.println("---------------------------------------");;
    }
    
    public double getNumero() {
        return numero;
    }
}

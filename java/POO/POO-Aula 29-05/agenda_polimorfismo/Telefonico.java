package agenda_polimorfismo;

public class Telefonico extends Contato {
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

package agenda_polimorfismo;

public class Contato {
    private String nome;

    public Contato(String nome) {
        this.nome = nome;
    }

    public void mostrarInformacoes() {
        System.out.println("Contatos");
        System.out.println("Nome: "+this.getNome());
        System.out.println("---------------------------------------");;
    }

    public String getNome() {
        return nome;
    }
}

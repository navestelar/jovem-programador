package agenda_de_contatos;

public class Contatos {
    private String nome;

    public Contatos(String nome) {
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
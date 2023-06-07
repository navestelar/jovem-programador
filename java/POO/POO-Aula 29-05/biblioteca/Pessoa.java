package biblioteca;

public class Pessoa extends Emprestimo {
    private String nome;

    public Pessoa(double codigo, String nome) {
        super(codigo);
        this.nome = nome;
    }

    public void mostrarInformacoes() {
        System.out.println("Emprestimo");
        System.out.println("codigo: "+this.getCodigo());
        System.out.println("nome: "+this.getNome());
        System.out.println("---------------------------------------");;
    }
    
    public String getNome() {
        return nome;
    }
}

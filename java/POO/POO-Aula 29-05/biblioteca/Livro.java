package biblioteca;

public class Livro extends Emprestimo {
    private String titulo;

    public Livro(double codigo, String titulo) {
        super(codigo);
        this.titulo = titulo;
    }
    
    public void mostrarInformacoes() {
        System.out.println("Emprestimo");
        System.out.println("codigo: "+this.getCodigo());
        System.out.println("titulo: "+this.getTitulo());
        System.out.println("---------------------------------------");;
    }

    public String getTitulo() {
        return titulo;
    }
}

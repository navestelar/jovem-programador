public class Livro extends Produto {

    private String autor;
    
    public Livro(String nome, double preco, String descricao, String autor) {
        super(nome, preco, descricao);
        this.autor = autor;
    }
    
    public String getAutor() {
        return autor;
    }
}

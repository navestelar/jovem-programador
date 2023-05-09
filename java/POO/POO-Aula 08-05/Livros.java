public class Livros {
    private String nome; 
    private String autor; 
    private int numeroDePaginas; 
    private double avaliacoes;
    
    public Livros(String nome, String autor, int numeroDePaginas, double avaliacoes){
        this.setNome(nome);
        this.setAutor(autor);
        this.setNumeroDePaginas(numeroDePaginas);
        this.setAvaliacoes(avaliacoes);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }
    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }
    
    public double getAvaliacoes() {
        return avaliacoes;
    }
    public void setAvaliacoes(double avaliacoes) {
        this.avaliacoes = avaliacoes;
    } 
}

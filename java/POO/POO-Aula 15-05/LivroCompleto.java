public class LivroCompleto {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    
    public LivroCompleto(String titulo, String autor, double anoPublicacao){
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setAnoPublicacao(getAnoPublicacao());
    }

    public void exibirInformacoes(){
        System.out.println(titulo+" de "+autor+" publicado em "+anoPublicacao);
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}

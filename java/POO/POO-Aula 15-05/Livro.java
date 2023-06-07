public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public void exibirInformacoes(){
        System.out.println(titulo+" de "+autor+" publicado em "+anoPublicacao);
    }

    public static void main(String[] args) {
        Livro novoLivro = new Livro();
        novoLivro.titulo = "O Pequeno Príncipe";
        novoLivro.autor = "Antoine de Saint-Exupéry";
        novoLivro.anoPublicacao = 1943;
        novoLivro.exibirInformacoes();
    }
}

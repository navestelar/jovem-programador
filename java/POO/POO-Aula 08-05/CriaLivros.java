public class CriaLivros {
    public static void main(String[] args) {
        Livros livro1 = new Livros("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 96, 9.8);

        System.out.println(livro1.getNome());
        System.out.println(livro1.getAutor());
        System.out.println(livro1.getNumeroDePaginas());
        System.out.println(livro1.getAvaliacoes());
    }
}

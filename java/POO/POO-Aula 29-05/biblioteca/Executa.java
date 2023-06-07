package biblioteca;

public class Executa {
    public static void main(String[] args) {
        Emprestimo emprestimo = new Emprestimo(12345);
        Livro livro = new Livro(12345, "null");
        Pessoa pessoa = new Pessoa(123450, "null");
        emprestimo.mostrarInformacoes();
        livro.mostrarInformacoes();
        pessoa.mostrarInformacoes();   
    }
}

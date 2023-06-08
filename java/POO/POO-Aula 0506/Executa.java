public class Executa {
    public static void main(String[] args) {
        Contato email = new Email("email");
        // email.exibir();
        Pessoa pessoa = new Pessoa("nome", 5);
        // System.out.println(pessoa.getNome());
        pessoa.adicionarContato(email);
        pessoa.exibirContatos();
    }
}

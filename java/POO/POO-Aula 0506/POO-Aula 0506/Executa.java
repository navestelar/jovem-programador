public class Executa {
    public static void main(String[] args) {
        Contato email = new Email("email");
        email.exibir();
        Contato telefone = new Telefone("telefone");
        Contato email2 = new Email("email2");
        Pessoa pessoa = new Pessoa("nome", 5);
        System.out.println(pessoa.getNome());
        pessoa.adicionarContato(email);
        pessoa.adicionarContato(telefone);
        pessoa.adicionarContato(email2);
        pessoa.exibirContatos();
        pessoa.getContatos("email");
        pessoa.getContatos("telefone")[0].exibir();
        System.out.println(pessoa.possuiTelefone());
    }
}

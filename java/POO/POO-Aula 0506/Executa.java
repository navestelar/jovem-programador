public class Executa {
    public static void main(String[] args) {
        Contato email = new Email("email");
        email.exibir();
        Pessoa pessoa = new Pessoa("email", 5);
        pessoa.adicionarContato(email);
        System.out.println(pessoa.getClass());
    }
}

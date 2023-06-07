package agenda_de_contatos;

public class Executa {
    public static void main(String[] args) {
        Contatos contatos = new Contatos("Ana");
        Telefonico telefonico = new Telefonico("null", 123456789);
        Email email = new Email("null", "null@email.com");
        contatos.mostrarInformacoes();
        telefonico.mostrarInformacoes();
        email.mostrarInformacoes();
    }
}

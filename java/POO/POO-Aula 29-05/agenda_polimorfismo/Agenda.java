package agenda_polimorfismo;

public class Agenda {
    public static void main(String[] args) {
        Contato[] contato = new Contato[4];

        contato[0] = new Email("contato", "email@email.com");
        contato[1] = new Telefonico("Telefone ", 123456789);
        contato[2] = new Email("contato", "email@email.com");
        contato[3] = new Telefonico("Telefone ", 123456789);

        for(int i=0; i<=3; i++){
            contato[i].mostrarInformacoes();
        }
    }
}

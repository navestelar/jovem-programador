package agenda_de_contatos;

public class Email extends Contatos {
    private String email;

    public Email(String nome, String email) {
        super(nome);
        this.email = email;
    }
    
    public void mostrarInformacoes() {
        System.out.println("Contatos");
        System.out.println("Nome: "+this.getNome());
        System.out.println("Email: "+this.getEmail());
        System.out.println("---------------------------------------");;
    }

    public String getEmail() {
        return email;
    }
}

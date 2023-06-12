public class Email extends Contato {
    private String email;
    
    public Email(String email) {
        tipo="email";
        this.email = email;
    }

    public void exibir() {
        System.out.println("Email: "+this.getEmail());
    }

    public String getEmail() {
        return email;
    }
}

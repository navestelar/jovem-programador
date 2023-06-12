public class Telefone extends Contato {
    private String telefone;
    public Telefone(String telefone) {
        tipo="telefone";
        this.telefone = telefone;
    }
    public void exibir() {
        System.out.println("Telefone: "+this.getTelefone());
    }
    public String getTelefone() {
        return telefone;
    }
}

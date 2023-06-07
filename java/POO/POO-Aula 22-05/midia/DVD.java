package midia;

public class DVD extends Midia {
    private String tituloDoFilme;

    public DVD(String tipo, double preco, String tituloDoFilme) {
        super(tipo, preco);
        this.tituloDoFilme = tituloDoFilme;
    }

    public void mostrarInformacoes(){
        System.out.println("DVD");
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Preço: "+this.getPreco());
        System.out.println("Título do Filme: "+this.getTituloDoFilme());
        System.out.println("----------------------------------");
    }
    
    public String getTituloDoFilme() {
        return tituloDoFilme;
    }
}

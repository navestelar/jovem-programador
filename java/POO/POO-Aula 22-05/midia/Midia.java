package midia;

public class Midia {
    private String tipo;
    private double preco;

    public Midia(String tipo, double preco) {
        this.tipo = tipo;
        this.preco = preco;
    }

    public void mostrarInformacoes(){
        System.out.println("Mídia");
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Preço: "+this.getPreco());
        System.out.println("----------------------------------");
    }
    
    public String getTipo() {
        return tipo;
    }
    public double getPreco() {
        return preco;
    }
}

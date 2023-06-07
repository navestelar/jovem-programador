package midia;

public class CD extends Midia {
    private String musica;

    public CD(String tipo, double preco, String musica) {
        super(tipo, preco);
        this.musica = musica;
    }
    
    public void mostrarInformacoes(){
        System.out.println("Mídia");
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Preço: "+this.getPreco());
        System.out.println("Música: "+this.getMusica());
        System.out.println("----------------------------------");
    }

    public String getMusica() {
        return musica;
    }
}

package formas_geometricas;

public class FormaGeometrica {
    private String cor;

    public FormaGeometrica(String cor) {
        this.cor = cor;
    }

    public void mostrarInformações(){
        System.out.println("Forma Geométrica");
        System.out.println("Cor: "+this.getCor());
        System.out.println("---------------------------------------");
    }
    
    public String getCor() {
        return cor;
    }
}

package formas_geometricas;

public class Quadrado extends FormaGeometrica {
    private double lado;

    public Quadrado(String cor, double lado) {
        super(cor);
        this.lado = lado;
    }

    public void mostrarInformações(){
        System.out.println("Quadrado");
        System.out.println("Cor: "+this.getCor());
        System.out.println("Lado: "+this.getLado());
        System.out.println("---------------------------------------");
    }
    
    public double getLado() {
        return lado;
    }
}

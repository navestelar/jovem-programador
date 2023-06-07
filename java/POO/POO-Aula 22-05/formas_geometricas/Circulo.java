package formas_geometricas;

public class Circulo extends FormaGeometrica {
    private double raio;

    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }

    public void mostrarInformações(){
        System.out.println("Círculo");
        System.out.println("Cor: "+this.getCor());
        System.out.println("Raio: "+this.getRaio());
        System.out.println("---------------------------------------");
    }
    
    public double getRaio() {
        return raio;
    }
}

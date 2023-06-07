package figuras_geometricas;

public class Circulo {
    private double raio;

    public double calcularArea(){
        return Math.PI*Math.pow(raio, 2);
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }
}

package figuras_geometricas;

public class Quadrado {
    private double lado;

    public double calcularArea(){
        return Math.pow(getLado(), 2);
    }

    public Quadrado(double lado) {
        this.lado = lado;
    }
    
    public double getLado() {
        return lado;
    }
}

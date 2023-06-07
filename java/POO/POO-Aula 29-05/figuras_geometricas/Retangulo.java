package figuras_geometricas;

public class Retangulo extends Quadrado {
    private double altura;

    public double calcularArea(){
        return getLado()*getAltura();
    }
    public Retangulo(double lado, double altura) {
        super(lado);
        this.altura = altura;
    }
    
    public double getAltura() {
        return altura;
    }
}

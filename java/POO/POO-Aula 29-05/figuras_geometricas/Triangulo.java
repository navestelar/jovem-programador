package figuras_geometricas;

public class Triangulo extends Retangulo {

    public Triangulo(double lado, double altura) {
        super(lado, altura);
    }
    
    public double calcularArea(){
        return (getLado()*getAltura())/2;
    }
}

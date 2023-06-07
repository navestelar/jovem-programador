package geometria;

public class Executa {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(5);
        quadrado.calcularPerimetro();
        quadrado.calcularArea();
        System.out.println(quadrado.getArea());
        System.out.println(quadrado.getPerimetro());
    }
}

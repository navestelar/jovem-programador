package figuras_geometricas;

public class Executa {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(5);
        Retangulo retangulo = new Retangulo(5, 10);
        Triangulo triangulo = new Triangulo(5, 10);
        Circulo circulo = new Circulo(5);
        System.out.println(quadrado.calcularArea());
        System.out.println(retangulo.calcularArea());
        System.out.println(triangulo.calcularArea());
        System.out.println(circulo.calcularArea());
    }
}

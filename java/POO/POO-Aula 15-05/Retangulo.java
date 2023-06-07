public class Retangulo {
    private double base;
    private double altura;

    public double calcularArea(){
        return (base*altura)/2;
    }

    public static void main(String[] args) {
        Retangulo novoRetangulo = new Retangulo();
        novoRetangulo.base = 2;
        novoRetangulo.altura = 3;
        System.out.println(novoRetangulo.calcularArea());
    }
}

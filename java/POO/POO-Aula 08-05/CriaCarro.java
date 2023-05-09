public class CriaCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro("rosa", 2, "fusca", "Volkswagen");

        System.out.println(carro1.getCor());
        System.out.println(carro1.getNumeroDePortas());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getMarca());
    }
}

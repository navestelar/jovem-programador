public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    public static void main(String[] args) {
        Carro novoCarro = new Carro();
        novoCarro.marca="Toyota";
        novoCarro.modelo="Corola";
        novoCarro.ano=2004;
        System.out.println(novoCarro.marca);
        System.out.println(novoCarro.modelo);
        System.out.println(novoCarro.ano);
    }
}

package veiculo;

public class Executa {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("a", "a", 1);
        Carro carro = new Carro("b", "b", 20, 4);
        Moto moto = new Moto("c", "c", 30, "c");
        veiculo.mostrarInformações();
        carro.mostrarInformações();
        moto.mostrarInformações();
    }
}

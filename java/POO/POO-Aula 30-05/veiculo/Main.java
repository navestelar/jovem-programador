package veiculo;

public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro("marca");
        carro.exibirMarca();
        carro.acelerar();
        carro.frear();
    }
}

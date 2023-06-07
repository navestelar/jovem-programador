package veiculo;

public class Executa {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();
        veiculo.mover();
        Veiculo aviao = new Aviao();
        aviao.mover();
        Veiculo carro = new Carro();
        carro.mover();
    }
}

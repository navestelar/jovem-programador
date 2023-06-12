package ex02;

public abstract class Produto {
    private Double precoDeVenda;
    private String dataDeValidade;
    private Double peso;
    abstract Double calcularPreco();
}

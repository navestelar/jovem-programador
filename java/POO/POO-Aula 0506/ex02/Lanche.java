package ex02;

public class Lanche extends Produto {
    private String tipoDePao;
    private String recheio;
    private String[] molhos;
    public Lanche(String tipoDePao, String recheio, String[] molhos) {
        this.tipoDePao = tipoDePao;
        this.recheio = recheio;
        this.molhos = molhos;
    }
    Double calcularPreco() {
        return null;
    }
}

package ex02;

public class Pizza extends Produto {
    private String recheio;
    private String borda;
    private String molho;
    public Pizza(String recheio, String borda, String molho) {
        this.recheio = recheio;
        this.borda = borda;
        this.molho = molho;
    }
    Double calcularPreco() {
        return null;
    }
}

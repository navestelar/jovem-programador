public class Eletronico extends Produto {

    private String marca;
    
    public Eletronico(String nome, double preco, String descricao, String marca) {
        super(nome, preco, descricao);
        this.marca = marca;
    }
    
    public String getMarca() {
        return marca;
    }
}

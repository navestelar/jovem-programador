public class Carro {
    private String cor;
    private Integer numeroDePortas;
    private String modelo;
    private String marca;

    public Carro(String cor, Integer numeroDePortas, String modelo, String marca){
        this.setCor(cor);
        this.setNumeroDePortas(numeroDePortas);
        this.setModelo(modelo);
        this.setMarca(marca);
    }
    
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public Integer getNumeroDePortas() {
        return numeroDePortas;
    }
    public void setNumeroDePortas(Integer numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }
    
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
}
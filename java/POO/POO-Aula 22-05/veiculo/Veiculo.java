package veiculo;
class Veiculo {
    private String marca;
    private String modelo;
    private int anoDeFabricacao;
    
    public Veiculo(String marca, String modelo, int anoDeFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public void mostrarInformações() {
        System.out.println("Veiculo");
        System.out.println("Marca: "+this.getMarca());
        System.out.println("Modelo: "+this.getModelo());
        System.out.println("Ano de Fabricação: "+this.getAnoDeFabricacao());
        System.out.println("-----------------------------------------------------");
    }
    
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }
}

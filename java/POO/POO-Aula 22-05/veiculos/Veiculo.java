package veiculos;

public class Veiculo {
    private String modelo;
    private double preco;
    
    public Veiculo(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }
    
    public void mostrarInformacoes(){
        System.out.println("Veículo");
        System.out.println("Modelo: "+this.getModelo());
        System.out.println("Preço: "+this.getPreco());
        System.out.println("---------------------------------------");
    }

    public String getModelo() {
        return modelo;
    }
    public double getPreco() {
        return preco;
    }
}

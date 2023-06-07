package veiculos;
public class Carro extends Veiculo {
    private double km;
    
    public Carro(String modelo, double preco, double km) {
        super(modelo,preco);
        this.km = km;
    }
    
    public void mostrarInformacoes(){
        System.out.println("Carro");
        System.out.println("Modelo: "+this.getModelo());
        System.out.println("Preço: "+this.getPreco());
        System.out.println("Km: "+this.getKm());
        System.out.println("-------------------------------------");
    }
    
    public double getKm() {
        return km;
    }
}

package veiculo;
public class Moto extends Veiculo {
    private String cilindrada;
    
    public Moto(String marca, String modelo, int anoDeFabricacao, String cilindrada) {
        super(marca, modelo, anoDeFabricacao);
        this.cilindrada = cilindrada;
    }
    
    public void mostrarInformações() {
        System.out.println("Veiculo");
        System.out.println("Marca: "+this.getMarca());
        System.out.println("Modelo: "+this.getModelo());
        System.out.println("Ano de Fabricação: "+this.getAnoDeFabricacao());
        System.out.println("Cilindrada: "+this.getCilindrada());
        System.out.println("-----------------------------------------------------");
    }
    
    public String getCilindrada() {
        return cilindrada;
    }
}

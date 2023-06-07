package veiculo;
public class Carro extends Veiculo {
    private int numeroDePortas;
    
    public Carro(String marca, String modelo, int anoDeFabricacao, int numeroDePortas) {
        super(marca, modelo, anoDeFabricacao);
        this.numeroDePortas = numeroDePortas;
    }
    
    public void mostrarInformações() {
        System.out.println("Veiculo");
        System.out.println("Marca: "+this.getMarca());
        System.out.println("Modelo: "+this.getModelo());
        System.out.println("Ano de Fabricação: "+this.getAnoDeFabricacao());
        System.out.println("Número de portas: "+this.getNumeroDePortas());
        System.out.println("-----------------------------------------------------");
    }
    
    public int getNumeroDePortas() {
        return numeroDePortas;
    }
}

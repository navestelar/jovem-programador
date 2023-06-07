package veiculos;
public class Moto extends Veiculo {
    private int ano;
    
    public Moto(String modelo, double preco, int ano) {
        super(modelo,preco);
        this.ano = ano;
    }
    
    public void mostrarInformacoes(){
        System.out.println("Moto");
        System.out.println("Modelo: "+this.getModelo());
        System.out.println("Preço: "+this.getPreco());
        System.out.println("Ano: "+this.getAno());
    }
    
    public int getAno() {
        return ano;
    }
}

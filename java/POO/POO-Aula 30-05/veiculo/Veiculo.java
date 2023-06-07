package veiculo;

public abstract class Veiculo {
    protected String marca;

    public Veiculo(String marca) {
        this.marca = marca;
    }
    
    public abstract void acelerar();
    public abstract void frear();

    public void exibirMarca(){
        System.out.println("Marca: "+marca);
    }
}

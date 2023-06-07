package veiculo;

public class Carro extends Veiculo {

    public Carro(String marca) {
        super(marca);
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerar");
    }

    @Override
    public void frear() {
        System.out.println("Frear");
    }
    
}

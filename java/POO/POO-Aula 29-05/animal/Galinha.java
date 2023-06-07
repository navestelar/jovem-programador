package animal;

public class Galinha extends Animal {

    public Galinha(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Pó Pó");
    }
}
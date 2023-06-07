package animal;

public class Executa {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 10, "Animal");
        Gato gato = new Gato("Gato", 20, "Gato", "branco");
        Cachorro cachorro = new Cachorro("cachorro", 10, "cachorro", "labrador");
        animal.mostrarInformações();
        gato.mostrarInformações();
        cachorro.mostrarInformações();
    }
}

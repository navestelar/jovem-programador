package animal;

public class TesteAnimais {
    private static Animal[] animal;
    public static void main(String[] args) {
        animal = new Animal[10];
    
        animal[0] = new Cachorro("Cachorro", 0);
        animal[1] = new Gato("gato", 1);
        animal[2] = new Galinha("Galinha", 2);
        animal[3] = new Cachorro("Cachorro", 3);
        animal[4] = new Gato("gato", 4);
        animal[5] = new Galinha("Galinha", 5);
        animal[6] = new Cachorro("Cachorro", 6);
        animal[7] = new Gato("gato", 7);
        animal[8] = new Galinha("Galinha", 8);
        animal[9] = new Cachorro("Cachorro", 9);

        for(int i=0; i<10; i++){
            animal[i].emitirSom();
        }
    }
}

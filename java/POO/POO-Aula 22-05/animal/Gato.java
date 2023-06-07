package animal;

public class Gato extends Animal{
    private String cor;
    
    
    public Gato(String nome, int idade, String especie, String cor) {
        super(nome, idade, especie);
        this.cor = cor;
    }

    public void mostrarInformações() {
        System.out.println("Gato");
        System.out.println("Nome: "+this.getNome());
        System.out.println("Idade: "+this.getIdade());
        System.out.println("Espécie: "+this.getEspecie());
        System.out.println("Cor: "+this.getCor());
        System.out.println("-----------------------------------------------------");
    }
    
    public String getCor() {
        return cor;
    }
}

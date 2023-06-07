package animal;

public class Cachorro extends Animal {
    private String raca;
    
    public Cachorro(String nome, int idade, String especie, String raca) {
        super(nome, idade, especie);
        this.raca=raca;
    }

    public void mostrarInformações() {
        System.out.println("Cachorro");
        System.out.println("Nome: "+this.getNome());
        System.out.println("Idade: "+this.getIdade());
        System.out.println("Espécie: "+this.getEspecie());
        System.out.println("Raça: "+this.getRaca());
        System.out.println("-----------------------------------------------------");
    }

    public String getRaca() {
        return raca;
    } 
}

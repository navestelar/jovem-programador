package animal;

public class Animal {
    private String nome;
    private int idade;
    private String especie;
    
    public Animal(String nome, int idade, String especie) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
    }

    public void mostrarInformações() {
        System.out.println("Animal");
        System.out.println("Nome: "+this.getNome());
        System.out.println("Idade: "+this.getIdade());
        System.out.println("Espécie: "+this.getEspecie());
        System.out.println("-----------------------------------------------------");
    }
    
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getEspecie() {
        return especie;
    }
}

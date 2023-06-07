package animal;

public abstract class Animal {
    private String nome;
    private int idade;
    public abstract void emitirSom();

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}

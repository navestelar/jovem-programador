public class Pessoa {
    private String nome;
    private int idade;
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome="Ana";
        pessoa1.idade=18;
        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome="Carlos";
        pessoa2.idade=22;
        System.out.println(pessoa1.nome);
        System.out.println(pessoa1.idade);
        System.out.println(pessoa2.nome);
        System.out.println(pessoa2.idade);
    }
}

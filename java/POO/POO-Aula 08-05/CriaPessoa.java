public class CriaPessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Ana", 18, "feminino");
        
        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());
        System.out.println(pessoa1.getSexo());
    }
}

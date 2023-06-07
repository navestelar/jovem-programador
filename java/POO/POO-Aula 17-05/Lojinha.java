public class Lojinha {
    public static void main(String[] args) {
        Livro livro = new Livro("Dom Casmurro", 29.90, "Romance clássico", "Machado de Assis");
        Eletronico eletronico = new Eletronico("Smartphone", 1999,"Tela de 6 polegadas", "Samsung");
        System.out.println("Livro: ");
        System.out.println("Nome: "+livro.getNome());
        System.out.println("Preço: "+livro.getPreco());
        System.out.println("Descrição: "+livro.getDescricao());
        System.out.println("Autor: "+livro.getAutor());

        System.out.println("\nEletrônico: ");
        System.out.println("Nome: "+eletronico.getNome());
        System.out.println("Preço: "+eletronico.getPreco());
        System.out.println("Descrição: "+eletronico.getDescricao());
        System.out.println("Marca: "+eletronico.getMarca());
    }
}

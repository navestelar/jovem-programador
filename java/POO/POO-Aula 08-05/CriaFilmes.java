public class CriaFilmes {
    public static void main(String[] args) {
        Filmes filme1 = new Filmes("A era do gelo", 9.8, 82, "O mamute Manny, o tigre de dentes-de-sabre Diego e a preguiça-gigante Sid são amigos em uma época muito distante dos dias atuais. Até o dia em que eles encontram um menino esquimó totalmente sozinho, longe de seus pais, e decidem ajudá-lo a achar sua família. Enquanto isso, o esquilo pré-histórico Scrat segue na sua saga para manter sua amada noz protegida de outros predadores.");

        System.out.println(filme1.getNome());
        System.out.println(filme1.getMediaDeAvaliacoes());
        System.out.println(filme1.getDuracaoEmMin());
        System.out.println(filme1.getResumo());
    }
    
}

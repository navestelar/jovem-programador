public class Executa {
    public static void main(String[] args) {
        CarroCompleto novoCarroCompleto = new CarroCompleto("Toyota", "Corola", 2004);
        System.out.println(novoCarroCompleto.getMarca());
        System.out.println(novoCarroCompleto.getModelo());
        System.out.println(novoCarroCompleto.getAno());
        System.out.println("-------------------------");
        PessoaCompleta pessoa1 = new PessoaCompleta("Ana", 18);
        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());
        PessoaCompleta pessoa2 = new PessoaCompleta("Carlos", 22);
        System.out.println(pessoa2.getNome());
        System.out.println(pessoa2.getIdade());
        System.out.println("-------------------------");
        CirculoCompleto novoCirculo = new CirculoCompleto(5);
        System.out.println(novoCirculo.CalculaArea());
        System.out.println("-------------------------");
        LivroCompleto novoLivro = new LivroCompleto("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943);
        novoLivro.exibirInformacoes();
        System.out.println("-------------------------");
        RetanguloCompleto novoRetangulo = new RetanguloCompleto(2, 3);
        System.out.println(novoRetangulo.calcularArea());
        System.out.println("-------------------------");
        PessoaFisica pessoaFisica = new PessoaFisica("Ana", 18, "12345678910");
        System.out.println(pessoaFisica.validarCpf());
        System.out.println("-------------------------");
        Conta novaConta = new Conta("Ana", 123, "456", 1000, "01/01/2001");
        System.out.println(novaConta.getTitular());
        System.out.println(novaConta.getNumero());
        System.out.println(novaConta.getAgencia());
        System.out.println(novaConta.getSaldo());
        System.out.println(novaConta.getDataDeAbertura());
        novaConta.sacar(500);
        System.out.println(novaConta.getSaldo());
        novaConta.depositar(1000);
        System.out.println(novaConta.getSaldo());
        novaConta.calculaRendimento();
        System.out.println(novaConta.getSaldo());
        System.out.println("-------------------------");
        System.out.println(novaConta.recuperaDadosParaImpressao());
    }
}

public class PessoaFisicaCompleta extends PessoaCompleta {

    public String cpf;
    
    public PessoaFisicaCompleta(String nome, int idade, String cpf) {
        super(nome, idade);
        this.setCpf(cpf);
    }
    
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

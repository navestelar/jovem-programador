public class PessoaFisica {
    private String nome;
    private int idade;
    private String cpf;
    
    public PessoaFisica(String nome, int idade, String cpf){
        setNome(nome);
        setIdade(idade);
        setCpf(cpf);
    }
    
    public String validarCpf(){
        if(getCpf().length() == 11){
            return "CPF válido";
        }else{
            return "CPF inválido";
        }
    }

    public static void main(String[] args) {
        PessoaFisica novaPessoaFisica = new PessoaFisica("Ana", 18, "12345678910");
        System.out.println(novaPessoaFisica.validarCpf());
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

public class Departamentos {

    private String nome;
    private int numeroDeFuncionarios;

    public Departamentos(String nome, int numeroDeFuncionarios){
        this.setNome(nome);
        this.setNumeroDeFuncionarios(numeroDeFuncionarios);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroDeFuncionarios() {
        return numeroDeFuncionarios;
    }

    public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }
}

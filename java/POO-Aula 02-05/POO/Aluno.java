package POO;

public class Aluno extends Pessoa {
    
    private String matricula;

    public Aluno(String nome, int idade, double altura, double peso, String matricula) {
        
        super(nome, idade, altura, peso);
        this.setMatricula(matricula);
    }

    public String getMatricula() {
        return matricula;
    }
    private void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}

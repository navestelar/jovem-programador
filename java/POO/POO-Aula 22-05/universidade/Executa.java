package universidade;

public class Executa {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("funcionario", 40, 1200);
        Professor professor = new Professor("professor", 60, 5000, "LPL");
        Administrativo administrativo = new Administrativo("adm", 90, 4000, "coordenação");
        funcionario.mostrarInformações();
        professor.mostrarInformações();
        administrativo.mostrarInformações();
    }
}

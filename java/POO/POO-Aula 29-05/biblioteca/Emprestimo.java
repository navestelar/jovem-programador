package biblioteca;

public class Emprestimo {
    private double codigo;

    public Emprestimo(double codigo) {
        this.codigo = codigo;
    }

    public void mostrarInformacoes() {
        System.out.println("Emprestimo");
        System.out.println("codigo: "+this.getCodigo());
        System.out.println("---------------------------------------");;
    }

    public double getCodigo() {
        return codigo;
    }

}

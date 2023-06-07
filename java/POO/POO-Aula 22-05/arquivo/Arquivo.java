package arquivo;

public class Arquivo {
    private double tamanho;
    private String titulo;

    public Arquivo(double tamanho, String titulo) {
        this.tamanho = tamanho;
        this.titulo = titulo;
    }

    public void mostrarInformacoes(){
        System.out.println("Arquivo");
        System.out.println("Tamanho: "+this.getTamanho());
        System.out.println("Título: "+this.getTitulo());
        System.out.println("----------------------------------");
    }

    public double getTamanho() {
        return tamanho;
    }
    public String getTitulo() {
        return titulo;
    }
}

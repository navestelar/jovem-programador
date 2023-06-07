package arquivo;

public class MP4 extends Arquivo {
    private int numeroDeViews;
    public MP4(double tamanho, String titulo, int numeroDeViews) {
        super(tamanho, titulo);
        this.numeroDeViews = numeroDeViews;
    }

    public void mostrarInformacoes(){
        System.out.println("MP4");
        System.out.println("Tamanho: "+this.getTamanho());
        System.out.println("Título: "+this.getTitulo());
        System.out.println("Número de views: "+this.getNumeroDeViews());
        System.out.println("----------------------------------");
    }
    
    public int getNumeroDeViews() {
        return numeroDeViews;
    }
}

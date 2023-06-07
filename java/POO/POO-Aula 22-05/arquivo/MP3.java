package arquivo;
public class MP3 extends Arquivo {
    private int numeroDeDownloads;
    
    public MP3(double tamanho, String titulo, int numeroDeDownloads) {
        super(tamanho, titulo);
        this.numeroDeDownloads = numeroDeDownloads;
    }

    public void mostrarInformacoes(){
        System.out.println("Arquivo");
        System.out.println("Tamanho: "+this.getTamanho());
        System.out.println("Título: "+this.getTitulo());
        System.out.println("Número de Downloads: "+this.getNumeroDeDownloads());
        System.out.println("----------------------------------");
    }

    public int getNumeroDeDownloads() {
        return numeroDeDownloads;
    }
    
}

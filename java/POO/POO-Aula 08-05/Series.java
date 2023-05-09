public class Series {
    private String nome; 
    private double mediaDeAvaliacoes; 
    private double duracaoDeCadaEpisodio; 
    private int episodiosPorTemporada; 
    private int numeroDeTemporadas;

    public Series(String nome, double mediaDeAvaliacoes, double duracaoDeCadaEpisodio, int episodiosPorTemporada, int numeroDeTemporadas){
        this.setNome(nome);
        this.setMediaDeAvaliacoes(mediaDeAvaliacoes);
        this.setDuracaoDeCadaEpisodio(duracaoDeCadaEpisodio);
        this.setEpisodiosPorTemporada(episodiosPorTemporada);
        this.setNumeroDeTemporadas(numeroDeTemporadas);
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getMediaDeAvaliacoes() {
        return mediaDeAvaliacoes;
    }
    public void setMediaDeAvaliacoes(double mediaDeAvaliacoes) {
        this.mediaDeAvaliacoes = mediaDeAvaliacoes;
    }
    
    public double getDuracaoDeCadaEpisodio() {
        return duracaoDeCadaEpisodio;
    }
    public void setDuracaoDeCadaEpisodio(double duracaoDeCadaEpisodio) {
        this.duracaoDeCadaEpisodio = duracaoDeCadaEpisodio;
    }
    
    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }
    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }
    
    public int getNumeroDeTemporadas() {
        return numeroDeTemporadas;
    }
    public void setNumeroDeTemporadas(int numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
    }
}

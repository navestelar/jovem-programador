public class Filmes {
    private String nome; 
    private double mediaDeAvaliacoes; 
    private double duracaoEmMin;
    private String resumo;

    public Filmes(String nome, double mediaDeAvaliacoes, double duracaoEmMin, String resumo){
        this.setNome(nome);
        this.setMediaDeAvaliacoes(mediaDeAvaliacoes);
        this.setDuracaoEmMin(duracaoEmMin);
        this.setResumo(resumo);
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
    
    public double getDuracaoEmMin() {
        return duracaoEmMin;
    }
    public void setDuracaoEmMin(double duracaoEmMin) {
        this.duracaoEmMin = duracaoEmMin;
    }
    
    public String getResumo() {
        return resumo;
    }
    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
}

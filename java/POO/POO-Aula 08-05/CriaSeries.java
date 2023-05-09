public class CriaSeries {
    public static void main(String[] args) {
        Series serie1 = new Series("Once Upon a Time", 9.8, 60, 22, 7);

        System.out.println(serie1.getNome());
        System.out.println(serie1.getMediaDeAvaliacoes());
        System.out.println(serie1.getDuracaoDeCadaEpisodio());
        System.out.println(serie1.getEpisodiosPorTemporada());
        System.out.println(serie1.getNumeroDeTemporadas());
    }
}

package arquivo;
// Exercício 7: 

// Crie uma classe pai chamada "Arquivo" que possui o atributo comum a todos os arquivos, como tamanho e titulo.  

// Crie duas classes filhas que herdem da classe "Arquivo", como "MP3" e "MP4".  

// Adicione atributos específicos para cada tipo de arquivo, como numero de downloads para MP3 e numero de visitas para MP4.  

// Implemente os construtores e métodos de acesso necessários.  

// Crie objetos das classes filhas e exiba as informações dos arquivos. 

public class Executa {
    public static void main(String[] args) {
        MP4 mp4 = new MP4(1.5, "null", 0);
        MP3 mp3 = new MP3(2.5, "null", 0);
        Arquivo arquivo = new Arquivo(5, "null");
        mp4.mostrarInformacoes();
        mp3.mostrarInformacoes();
        arquivo.mostrarInformacoes();
    }
}

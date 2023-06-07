package midia;

// Exercício 6: 

// Crie uma classe pai chamada "Midia" que possui o atributo comum a todas as mídias, como tipo e preço.  

// Crie duas classes filhas que herdem da classe "Midia", como "DVD" e "CD".  

// Adicione atributos específicos para cada tipo de midia, como Titulo do Filme para DVD e Tipo de Musica para CD. 

// Implemente os construtores e métodos de acesso necessários.  

// Crie objetos das classes filhas e exiba as informações das midia. 

public class Executa {
    public static void main(String[] args) {
        Midia midia = new Midia("a", 1.50);
        DVD dvd = new DVD("b", 20, "filme");
        CD cd = new CD("c", 10, "null");
        midia.mostrarInformacoes();
        dvd.mostrarInformacoes();
        cd.mostrarInformacoes();
    }
}

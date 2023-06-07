package formas_geometricas;
// Exercício 5: 

// Crie uma classe pai chamada "FormaGeometrica" que possui o atributo comum a todas as formas geométricas, como cor.  

// Crie duas classes filhas que herdem da classe "FormaGeometrica", como "Quadrado" e "Circulo".  

// Adicione atributos específicos para cada tipo de forma geométrica, como lado para o Quadrado e raio para o Círculo.  

// Implemente os construtores e métodos de acesso necessários.  

// Crie objetos das classes filhas e exiba as informações das formas geométricas. 
public class Executa {
    public static void main(String[] args) {
        FormaGeometrica formaGeometrica = new FormaGeometrica("Verde");
        Quadrado quadrado = new Quadrado("Branco", 2.1);
        Circulo circulo = new Circulo("rosa", 3.14);
        formaGeometrica.mostrarInformações();
        quadrado.mostrarInformações();
        circulo.mostrarInformações();
    }
}
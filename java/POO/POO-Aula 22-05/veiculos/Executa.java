package veiculos;
// Exercício 9: 

// Crie uma classe pai chamada "Veículo" que possui o atributo comum a todos os veículos, como modelo e preço.  

// Crie duas classes filhas que herdem da classe " Veículo ", como "Moto" e "Carro".  

// Adicione atributos específicos para cada tipo de arquivo, como ano para moto e km para carro.  

// Implemente os construtores e métodos de acesso necessários.  

// Crie objetos das classes filhas e exiba as informações dos veículos. 

public class Executa {
    public static void main(String[] args) {
        Carro carro = new Carro("null", 0, 0);
        Veiculo veiculo = new Veiculo("null", 0);
        Moto moto = new Moto("null", 0, 0);
        carro.mostrarInformacoes();
        veiculo.mostrarInformacoes();
        moto.mostrarInformacoes();
    }
}

package funcionarios;

// Exercício 8: 

// Crie uma classe pai chamada "Funcionário" que possui o atributo comum a todos os funcionários, como nome.  

// Crie duas classes filhas que herdem da classe "Funcionário", como "Mensalista" e "Horista".  

// Adicione atributos específicos para cada tipo de arquivo, como numero de horas trabalhadas e salario/h para Horista e salário fixo para Mensalista.  

// Implemente os construtores e métodos de acesso necessários.  

// Crie objetos das classes filhas e exiba as informações dos funcionários. 

public class Executa {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("null");
        Mensalista mensalista = new Mensalista("nome", 100000);
        Horista horista = new Horista("null", 50, 1000);
        funcionario.mostrarInformacoes();
        mensalista.mostrarInformacoes();
        horista.mostrarInformacoes();
    }
}
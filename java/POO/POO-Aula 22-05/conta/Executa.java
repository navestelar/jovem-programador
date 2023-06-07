package conta;
// Exercício 10: 

// Crie uma classe pai chamada "Conta" que possui o atributo comum a todas as contas, como titular, numero da conta, agencia e saldo.  

// Crie duas classes filhas que herdem da classe " Conta ", como "ContaPoupança" e "ContaEspecial".  

// Adicione atributos específicos para cada tipo de conta, como rendimento para ContaPoupança e limite para ContaEspecial.  

// Implemente os construtores e métodos de acesso necessários.  

// Crie objetos das classes filhas e exiba as informações das contas. 

// Adicione os métodos exibirInformacoes, depositar e sacar considerando que: 

// ContaPoupança permite o saque se o saldo não ficar negativo; 

// ContaEspecial permite ficar negativo até o limite.  

public class Executa {
    public static void main(String[] args) {
        Conta conta = new Conta("null", 0, "null", 1000);
        ContaPoupanca contaPoupanca = new ContaPoupanca("null", 0, "null", 1000, 1);
        ContaEspecial contaEspecial = new ContaEspecial(" ", 0, " ", 1000, 1500);
        conta.mostrarInformações();
        contaPoupanca.mostrarInformações();
        contaEspecial.mostrarInformações();
        contaEspecial.sacar(2500);
        contaEspecial.depositar(1000);
        contaEspecial.mostrarInformações();
    }
}

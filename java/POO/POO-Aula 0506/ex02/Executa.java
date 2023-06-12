package ex02;

import java.util.Scanner;

public class Executa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do{
            System.out.println("---------------------------------------------------------------");
            System.out.println("Você é cliente ou funcionário?");
            System.out.println("Digite 1 para CLIENTE");
            System.out.println("Digite 2 para FUNCIONÁRIO");
            System.out.println("Digite 0 para SAIR");
            System.out.print("Digite um número: ");
            opcao=scanner.nextInt();
            scanner.nextLine();
            switch (opcao){
                case 1:
                    System.out.println("Cliente");
                    break;
                case 2:
                    System.out.println("Funcionário");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }while(opcao!=0);
        scanner.close();
    }
}

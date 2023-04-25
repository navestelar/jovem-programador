import java.util.Scanner;

public class Ex01 {
    public static void main (String[] args) throws Exception {
        int opcao = 0;
        System.out.println("Menu Principal");
        System.out.println("1-Fim");
        System.out.println("2-Cadastro");
        System.out.println("3-Consulta");
        System.out.print("Escolha uma opção: ");
        Scanner input = new Scanner(System.in);
        opcao = input.nextInt();
        input.close();
        if (opcao==1){
            System.out.println("1-Fim");
        }else if (opcao==2){
            System.out.println("2-Cadastro");
        }else if (opcao==3){
            System.out.println("3-Consulta");
        }else {
        System.out.println("Opção inválida");
        }
    }
}
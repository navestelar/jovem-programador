import java.util.Scanner;

public class Ex03 {
    public static void main (String[] args) throws Exception {
        int code = 0;
        float n = 0;
        Scanner input = new Scanner(System.in);
        while (code != 1){
            System.out.println("--------------------------------------------------");
            System.out.println("1-Fim");
            System.out.println("2-Calcular raiz");
            System.out.print("Digite a sua escolha: ");
            code = input.nextInt();
            if (code == 1){
                System.out.println("1-Fim");
            }else if (code == 2 ){
                System.out.print("Escreva um número real: ");
                n = input.nextFloat();
                if (n>=0) {
                    System.out.print("A raíz quadrada de ");
                    System.out.print(n);
                    System.out.println(" é igual a ");
                    System.out.println(Math.sqrt(n));
                }else {
                    System.out.println("Erro! número negativo não possui raíz real");
                }
            }else {
                System.out.println("Código inválido");
            }
        }
        input.close();
    }
}

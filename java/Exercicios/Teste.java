import java.util.Scanner;
public class Teste {
    public static void main (String[] args) throws Exception{
        int n7 = 0;
        int digito7 = 0;
        Scanner input7 = new Scanner(System.in);
        System.out.print("Escreva um número inteiro: ");
        n7 = input7.nextInt();
        for (int i=String.valueOf(n7).length(); i>=0; i--){
            digito7 = (int) (n7/Math.pow(10, i));
            System.out.println(digito7);  
        }
    }
}

import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;

public class Teste {
    public static void main (String[] args){
        int[] numeros;
        int i,n=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de números: ");
        n = input.nextInt();
        numeros = new int[n];
        for (i=0;i<n;i++){
            System.out.print("Digite o número "+i+": ");
            numeros[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(numeros));
        input.close();
    }
}

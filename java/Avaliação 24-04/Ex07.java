import java.util.Arrays;
import java.util.Scanner;

public class Ex07 {
    public static void main (String[] args) throws Exception {
        int[] valor = new int[10];
        int[] pares = new int[10];
        int npar = 0;
        int maior=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Escreva o número 1: ");
        valor[0]=input.nextInt();
        int menor = valor[0];
        for (int i=1;i<10;i++){
            System.out.print("Escreva o número "+(i+1)+": ");
            valor[i]=input.nextInt();
            if ((valor[i]%2)==0) {
                pares[npar]=valor[i];
                npar++;
            }
            if (valor[i]<menor) {
                menor = valor[i];
            }
            if (valor[i]>maior){
                maior = valor[i];
            }
        }
        System.out.println(Arrays.toString(pares));
        System.out.println("O maior valor lido foi: "+maior);
        System.out.println("O menor valor lido foi: "+menor);
        input.close();
    }
}

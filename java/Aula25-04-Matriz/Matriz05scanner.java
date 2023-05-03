import java.util.Scanner;

public class Matriz05scanner {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de linhas da matriz: ");
        int linhas = input.nextInt();
        System.out.println("Digite o número de colunas da matyriz: ");
        int colunas = input.nextInt();
        int[][] matriz = new int[linhas][colunas];
        System.out.println("Digite os elementos da matriz: ");
        for (int i=0;i<linhas;i++){
            for (int j=0; j<colunas;j++){
                matriz[i][j]=input.nextInt();
            }
        }
        System.out.println("Matriz digitada: ");
        for (int i=0;i<linhas;i++){
            for (int j=0;j<colunas;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        input.close();
    }
}
import java.util.Scanner;

public class Ex06 {
    /**
     * @param args
     * @throws Exception
     */
    public static void main (String[] args) throws Exception {
        int n = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Quantidade de pessoas: ");
        n = input.nextInt();
        int[] idade =  new int[n];
        String[] nome = new String[n];
        String[] sexo = new String[n];
        int[] auxA = new int[n];
        int[] auxB = new int[n];
        int[] auxC = new int[n];
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i=0;i<n;i++){
            System.out.print("Escreva o nome, idade e sexo da pessoa "+(i+1)+": ");
            nome[i] = input.next();
            idade[i] = input.nextInt();
            sexo[i] = input.next();
            if(idade[i]>idade[0]){
                auxA[a]=i;
                a++;
            }
            if(sexo[i]=="mulher"){
                auxB[b]=i;
                b++;
            }
            if((sexo[i]=="homem") && idade[i]<21){
                auxC[c]=i;
                c++;
            }
        }
        System.out.println("As pessoas mais velhas que a primeira pessoa são: ");
        for (int i=0;i<a;i++){
            System.out.print("Nome: "+nome[auxA[i]]+" ");
            System.out.print("Idade: "+idade[auxA[i]]+" ");
            System.out.println("Sexo: "+sexo[auxA[i]]+" ");
        }
        System.out.println("--------------------------------");
        System.out.println("Todas as mulheres são: ");
        for (int i=0;i<b;i++){
            System.out.print("Nome: "+nome[auxB[i]]+" ");
            System.out.println("Idade: "+idade[auxB[i]]+" ");
        }
        System.out.println("-----------------------------------------");
        System.out.println("Os homens menores de 21 são: ");
        for (int i=0;i<b;i++){
            System.out.print("Nome: "+nome[auxC[i]]+" ");
        }
        input.close();
    }
}

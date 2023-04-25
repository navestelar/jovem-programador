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
            System.out.print("Escreva o nome da pessoa "+(i+1)+": ");
            nome[i] = input.next();
            System.out.print("Escreva a idade pessoa "+(i+1)+": ");
            idade[i] = input.nextInt();
            System.out.print("Escreva o sexo da pessoa "+(i+1)+": ");
            sexo[i] = input.next();
            if(idade[i]>idade[0]){
                auxA[a]=i;
                a++;
            }
            if(sexo[i].contains("mulher")){
                auxB[b]=i;
                b++;
            }
            if((sexo[i].contains( "homem")) && idade[i]<21){
                auxC[c]=i;
                c++;
            }
        }
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("As pessoas mais velhas que a primeira pessoa são: ");
        for (int x=0;x<a;x++){
            System.out.print("Nome:"+nome[auxA[x]]+" ");
            System.out.print("Idade:"+idade[auxA[x]]+" ");
            System.out.println("Sexo:"+sexo[auxA[x]]+" ");
        }
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("Todas as mulheres são: ");
        for (int j=0;j<b;j++){
            System.out.print("Nome:"+nome[auxB[j]]+" ");
            System.out.println("Idade:"+idade[auxB[j]]+" ");
        }
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Os homens menores de 21 são: ");
        for (int k=0;k<b;k++){
            System.out.println("Nome:"+nome[auxC[k]]+" ");
        }
        input.close();
    }
}

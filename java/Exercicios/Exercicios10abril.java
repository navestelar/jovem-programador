import java.util.Scanner;

public class Exercicios10abril {
    /**
     * @param args
     * @throws Exception
     */
    public static void main (String[] args) throws Exception{
        int codigo = 0;
        Scanner code = new Scanner(System.in);
        System.out.println("CÓDIGO     DESCRIÇÃO");
        System.out.println("  1        números pares de 1 a 100");
        System.out.println("  2        média aritmética de uma lista de números");
        System.out.println("  3        número máximo");
        System.out.println("  4        palíndromo");
        System.out.println("  5        fatorial");
        System.out.println("  6        Fibonacci");
        System.out.println("  7        Soma dos dígitos");
        System.out.println("---------------------------------------------------");
        System.out.println("Escolha seu código: ");
        codigo = code.nextInt();
        System.out.println("Código: "+codigo);
        if (codigo==1){
            for (int i1 = 0; i1<=50; i1++){
                System.out.println(i1*2);
            }
        }else if (codigo==2){
            int qtdNumero=0, contador = 1;
            double numero, media = 0;
            Scanner input2 = new Scanner(System.in);
            System.out.print("Digite a quantidade de números: "); 
            qtdNumero = input2.nextInt();
            while(contador<=qtdNumero){
                System.out.print("Digite o "+contador+" número:");
                numero = input2.nextDouble();
                media += numero;
                contador++;
            }
            media /= qtdNumero;
            System.out.print("A média aritmética é: "+media);       
        }else if (codigo==3){
            double n1,n2 = 0;
            int qtdN = 0;
            Scanner input3 = new Scanner(System.in);
            System.out.print("Digite a quantidade de números: ");
            qtdN = input3.nextInt();
            System.out.print("Digite o 1 número:");
            n2 = input3.nextDouble();
            for (int i3=2; i3<=qtdN; i3++){
                System.out.println("Digite o "+i3+" número:");
                n1 = input3.nextDouble();
                if (n1>n2){
                    n2 = n1;
                }  
            }  
            System.out.println("O número máximo é: "+n2);
        }else if (codigo==4){
            String palavra = "";
            String letraI, letraF = "";
            int teste = 0;
            Scanner input4 = new Scanner(System.in);
            System.out.println("Escreva uma palavra: ");
            palavra = input4.next();
            int pF = palavra.length();
            for (int i=0; i<=palavra.length()/2; i++){
                letraI = palavra.substring(i,i+1);
                letraF = palavra.substring(pF-1-i,pF-i);
                if (!letraI.equalsIgnoreCase(letraF)){
                    teste = 1;
                }
            }
            if (teste==0){
                System.out.println("A palavra "+palavra+" é um palíndromo.");
            }else {
                System.out.println("A palavra "+palavra+" não é um palíndromo.");
            }
        } else if (codigo == 5){
            int n5 = 0;
            int fatorial = 1;
            Scanner input5 = new Scanner(System.in);
            System.out.print("Escreva um número inteiro: ");
            n5 = input5.nextInt();
            for (int i=1; i<=n5; i++){
                fatorial = fatorial*(n5-i+1);
            }
            System.out.println(n5+"! = "+fatorial);
        }else if (codigo==6){
            int n6 = 0;
            int x6 = 0;
            int z6 = 0;
            int y6 = 1;
            Scanner input6 = new Scanner(System.in);
            System.out.print("Escreva um número inteiro: ");
            n6 = input6.nextInt();
            for (int i=1; i<=n6; i++){
                z6=x6;
                x6=x6+y6;
                y6=z6;
                System.out.println(x6);
            } 
        }
        else{
            System.out.println("Código inválido!");
        }
    }
}
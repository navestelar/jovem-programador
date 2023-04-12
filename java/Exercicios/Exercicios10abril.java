import java.util.Arrays;
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
        System.out.println("  1        Números pares de 1 a 100");
        System.out.println("  2        Média aritmética de uma lista de números");
        System.out.println("  3        Número máximo");
        System.out.println("  4        Palíndromo");
        System.out.println("  5        Fatorial");
        System.out.println("  6        Fibonacci");
        System.out.println("  7        Soma dos dígitos");
        System.out.println("  8        Número primo");
        System.out.println("  9        MDC");
        System.out.println(" 10        MMC");
        System.out.println(" 11        Soma Array");
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
        }else if (codigo==21){
            double[] numeros21 = {2.5,3.0,4.5,5.5};
            double soma21 = 0;
            for (double numero21 : numeros21){
                soma21+=numero21;
            }
            double media21 = soma21/numeros21.length;
            System.out.println("A média é: "+media21);
        }
        else if (codigo==3){
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
        }else if (codigo==7){
            int n7 = 0;
        int digito7 = 0;
        int z7 = 0;
        int soma7 = 0;
        Scanner input7 = new Scanner(System.in);
        System.out.print("Escreva um número inteiro: ");
        n7 = input7.nextInt();
        for (int i=(String.valueOf(n7).length()-1); i>=0; i--){
            digito7 = (int) (n7/Math.pow(10, i)-z7);
            z7 = z7*10 + digito7*10;
            soma7 = soma7 + digito7;
        }
        System.out.println("A soma dos dígitos do número "+n7+" é "+soma7);
        }else if (codigo==8){
            int n8 = 0;
        int contador8 = 0;
        Scanner input8 = new Scanner(System.in);
        System.out.print("Escreva um número inteiro: ");
        n8 = input8.nextInt();
        for (int i=1;i<=n8;i++){
            if(n8%i==0){
                contador8++;
            }
        }
        if (contador8==2){
            System.out.println("O número "+n8+" é primo");
        }else {
            System.out.println("O número "+n8+" não é primo.");
        }
        }else if (codigo==9){
            int n91, n92, mdc9 = 0;
            Scanner input91 = new Scanner(System.in);
            System.out.print("Escreva o primeiro número inteiro: ");
            n91 = input91.nextInt();
            Scanner input92 = new Scanner(System.in);
            System.out.print("Escreva o segundo número inteiro: ");
            n92 = input92.nextInt();
            for(int i9=1;i9<=n91;i9++){
                if(n91%i9==0 && n92%i9==0){
                    mdc9=i9;
                }
            }
            System.out.println("O Máximo Divisor Comum entre "+n91+" e "+n92+" é igual a "+mdc9);
        }else if(codigo==10){
            int n101, n102, mmc10 = 0;
            Scanner input101 = new Scanner(System.in);
            System.out.print("Escreva o primeiro número inteiro: ");
            n101 = input101.nextInt();
            Scanner input102 = new Scanner(System.in);
            System.out.print("Escreva o segundo número inteiro: ");
            n102 = input102.nextInt();
            for(int i10=n101*n102;i10>=2;i10--){
                if(i10%n101==0 && i10%n102==0){
                    mmc10=i10;
                }
            }
            System.out.println("O Mínimo Múltiplo Comum entre "+n101+" e "+n102+" é igual a "+mmc10);
        }else if (codigo==11){
            int soma11 = 0;
            Scanner input111 = new Scanner(System.in);
            System.out.print("Escreva a quantidade de números: ");
            int qtd11 = input111.nextInt();
            int n11[] = new int[qtd11];
            for (int i11 = 0; i11<qtd11; i11++){
                Scanner input112 = new Scanner(System.in);
                System.out.println("Escreva o "+(i11+1)+" número: ");
                n11[i11] = input112.nextInt();
                soma11 += n11[i11];
            }
            System.out.println("A soma do Array é: "+soma11);
        }else if(codigo==111){
            int[] numeros1111 = {1,2,3,4,5};
            int soma1111 = 0;
            for (int i1111 = 0; i1111<numeros1111.length;i1111++){
             soma1111+=numeros1111[i1111];
            } 
            System.out.println("A soma do Array "+Arrays.toString(numeros1111)+" é: "+soma1111);
        }else if(codigo==121){
            int[] numeros12 = {5,3,9,2,1};
            int menor12 = numeros12[0];
            for(int i12=1;i12<numeros12.length;i12++){
             if(numeros12[i12]<menor12){
                 menor12 = numeros12[i12];
             }
            }
            System.out.println("O menor valor do Array "+Arrays.toString(numeros12)+" é "+menor12);
        }else if(codigo==131){
            
        }
        else{
            System.out.println("Código inválido!");
        }
    }
}
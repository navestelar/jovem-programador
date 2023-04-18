import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;

public class Exercicios17abril{
    public static void main (String[] args){
        int codigo,n,idade,i,contador = 0;
        float n1,n2,n3,media=0;
        String nome,nome2=" ";
        Scanner input = new Scanner(System.in);
        System.out.println("CÓDIGO     DESCRIÇÃO");
        System.out.println("  1        Média");
        System.out.println("  2        Ímpar/Par");
        System.out.println("  3        Sequência 0 até n");
        System.out.println("  4        Sequência pares 0 até n");
        System.out.println("  5        Pessoa mais nova");
        System.out.println("  6        Fibonacci");
        System.out.println("  7        Número primo");
        System.out.println("  8        Número perfeito");
        System.out.println("  9        Palavras repetidas Array HashMap");
        System.out.println("---------------------------------------------------");
        System.out.println("Escolha seu código: ");
        codigo = input.nextInt();
        System.out.println("Código: "+codigo);
        if (codigo==1){
            System.out.println("Escreva as 3 notas: ");
            n1 = input.nextFloat();
            n2 = input.nextFloat();
            n3 = input.nextFloat();
            media = (n1+n2+n3)/3;
            if (media>=7){
                System.out.println("Aprovado com média: "+media);
            }else {
                System.out.println("Reprovado com média: "+media);
            }
        } else if (codigo==2){
            System.out.println("Escreva um número inteiro: ");
            n = input.nextInt();
            if (n%2==0){
                n2 = n+5;
                n1 = 5;
            }else {
                n2 = n+8;
                n1 = 8;
            }
            System.out.println(n+" + "+n1+" = "+n2);
        } else if (codigo==3){
            System.out.println("Escreva um número inteiro: ");
            n = input.nextInt();
            System.out.println("A sequência de números entre 0 e "+n+" é: ");
            for (i=0;i<=n;i++){
                System.out.println(i);
            }
        } else if (codigo==4){
            System.out.println("Escreva um número inteiro: ");
            n = input.nextInt();
            System.out.println("A sequência de números pares entre 0 e "+n+" é: ");
            for (i=0;i<=n;i+=2){
                System.out.println(i);
            }
        } else if (codigo==5){
            System.out.println("Escreva o nome da pessoa 1: ");
            nome = input.next();
            System.out.println("Escreva a idade de "+nome+": ");
            idade = input.nextInt();
            for (i=2;i<=10;i++){
                System.out.println("Escreva o nome da pessoa "+i+": ");
                nome2 = input.next();
                System.out.println("Escreva a idade de "+nome2+": ");
                n = input.nextInt();
                if (idade>n){
                    idade = n;
                    nome = nome2;
                }
            }
            System.out.println(nome+" tem "+idade+" anos e é a pessoa mais nova!");
        } else if (codigo==6){
            System.out.println("Escreva um número inteiro positivo: ");
            n = input.nextInt(); 
            System.out.println("A sequência de Fibonacci do primeio ao "+n+" termo é: ");
            n1 = 0;
            n2 = 1;
            n3 = 0;
            for (i=1;i<=n;i++){
                n1 = n3;
                System.out.println(n1);
                n3 += n2;
                n2 = n1;
            }
        } else if (codigo==7){
            System.out.println("Escreva um número inteiro positivo: ");
            n = input.nextInt(); 
            for (i=1;i<=n;i++){
                if (n%i==0){
                    contador++;
                }  
            } 
            if (contador==2){
                System.out.println(n+" é um número primo!");
            }else {
                System.out.println(n+" não é um número primo!");
            }
        } else if (codigo==8){
            n1=0;
            System.out.println("Escreva um número inteiro positivo: ");
            n = input.nextInt(); 
            for (i=1;i<n;i++){
                if (n%i==0){
                    n1+=i;
                }  
            } 
            if (n1==n){
                System.out.println(n+" é um número perfeito!");
            }else {
                System.out.println(n+" não é um número perfeito!");
            }
        } else if (codigo==9){
            String frase = " ";
            System.out.println("Escreva uma frase: ");
            Scanner inputFrase = new Scanner(System.in);
            frase = inputFrase.nextLine();
            System.out.println(frase);
            String[] palavras = frase.split(" ");
            System.out.println(Arrays.toString(palavras));
            HashMap<String, Integer>contagem = new HashMap<>();
            for (String palavra :palavras){
                 if(contagem.containsKey(palavra)){
                     contagem.put(palavra, contagem.get(palavra)+1);
                 }else {
                     contagem.put(palavra, 1);
                 }
            }
            System.out.println("Contagem de palavras: "+contagem);
            inputFrase.close();
        }
        else {
            System.out.println("Código inválido");
        }
        
        input.close();
    }
}
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Desafios10abril {
    public static void main (String[] args) throws Exception{
        int codigo = 0;
        Scanner code = new Scanner(System.in);
        System.out.println("CÓDIGO     DESCRIÇÃO");
        System.out.println("  1        Números primos");
        System.out.println("  2        Segundo maior número Array");
        System.out.println("  3        String Array HashMap");
        System.out.println("  4        Array soma máxima");
        System.out.println("Escolha seu código: ");
        codigo = code.nextInt();
        System.out.println("Código: "+codigo);
        if (codigo==1){
            Scanner input1 = new Scanner(System.in);
            System.out.print("Digite um número inteiro positivo: ");
            int n1 = input1.nextInt();
            System.out.println("Números primos menores ou igual a "+n1+": ");
            for (int i1=2; i1<= n1;i1++){
                boolean primo1 = true;
                for (int j1=2; j1<i1;j1++){
                    if(i1%j1==0){
                        primo1=false;
                        break;
                    }
                }
                if(primo1){
                    System.out.println(i1+" ");
                }
            }
        }else if(codigo==2){
            int[] numeros2 = {1,2,3,4,5};
            int maior2_1 = 0;
            int maior2_2 = numeros2[0];
            for (int i2=1;i2<numeros2.length;i2++){
                 if(numeros2[i2]>maior2_1){
                     maior2_2=maior2_1;
                     maior2_1 = numeros2[i2];
                 }else if (numeros2[i2]>maior2_2 && numeros2[i2] != maior2_1){
                     maior2_2 = numeros2[i2];
                 }
            }
            System.out.println("O segundo maior número do Array é: "+maior2_2);
        }else if(codigo==3){
            String[] palavras3 = {"roma","amor","mora","carro","corra"};
            HashMap<String,HashSet<String>> anagramas3 = new HashMap<>();
            for (int i3=0;i3<palavras3.length;i3++){
                 String palavra3 = palavras3[i3];
                 char[] letras3 = palavra3.toCharArray();
                 Arrays.sort(letras3);
                 String chave3 = new String(letras3);
                 if (anagramas3.containsKey(chave3)){
                     anagramas3.get(chave3).add(palavra3);
                 }else {
                     HashSet<String> conjunto3 = new HashSet<>();
                     conjunto3.add(palavra3);
                     anagramas3.put(chave3, conjunto3);
                 }
            }
            System.out.println("Anagramas: "+anagramas3);
        }else if (codigo==4){
            int[] numeros4 = {1,4,6,2,7,3};
            int soma4_1 = numeros4[0]+numeros4[1];
            int soma4_2 = 0;
            for (int i4=0;i4<numeros4.length;i4++){
                for (int j4=0;j4<numeros4.length;j4++){
                    soma4_2 = numeros4[i4]+numeros4[j4];
                    if (i4!=j4){
                        if (soma4_2>soma4_1){
                            soma4_1=soma4_2; 
                        }
                    }
                    
                }
            }
            System.out.println(soma4_1);
        }
        else {
            System.out.println("Código inválido ");
        }
    }
}

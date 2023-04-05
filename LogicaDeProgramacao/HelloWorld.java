import java.math.BigDecimal;
import java.util.Scanner;

public class HelloWorld {

    public Integer soma(Integer n1, Integer n2){
        Integer s = n1+n2;
        return s;
    }
    public static void main(String[] args) throws Exception {

        //Print Hello World
        System.out.println("Hello World!");

        //Criar variável:string
        String teste=new String("Teste");

        String teste2=new String();
        teste2="valor";
        System.out.println(teste+"\n"+teste2);

        //criar variável:número inteiro
        Integer a,b,c;
        a=1;
        b=2;
        c=a+b;
        System.out.println("Resultado da soma: "+c);

        //Criar variável:número decimal
        BigDecimal casaDecimal = new BigDecimal(10.2);
        System.out.println(casaDecimal);

        // System.out.println(soma(5,10).toString());

        // int inteiroPrimitivo = 1;
        // double valor = 1.75;
        // char charPrimitivo = 'Teste';
        // boolean isBoolean = true;
        // String data = new String("2023-04-04");

        Scanner input = new Scanner(System.in);

        int int1,int2,int3;

        System.out.println("Escreva o primeiro número inteiro: ");
        int1 = input.nextInt();

        System.out.println("Escreva o segundo número inteiro: ");
        int2 = input.nextInt();

        int3 = int1+int2;

        System.out.println("A soma é: "+int3);
    }
}
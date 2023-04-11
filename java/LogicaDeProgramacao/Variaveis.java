import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Variaveis {
    public static void main(String[] args) throws Exception{
        /* 
        //Declarar variável
        int variavelInt = 500;
        char variavelChar = 0;
        //print
        System.out.println(variavelInt);
        System.out.println(variavelChar);


        //Programa idade eleitoral
        int idade;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        idade = input.nextInt();
        //Condicional if else
        if(idade<16){
            System.out.println("Você não pode votar.");
        }else if(idade>=16 && idade<18 || idade>60){
            System.out.println("Seu voto é opcional.");
        }else {
            System.out.println("Seu voto é obrigatório.");
        }


        //loop for
        for (int i = 1; i<=10; i++){
            System.out.println(i);
        }

        //loop while
        int i = 1;
        while (i<=10){
            System.out.println(i);
            i++;
        }
        

        //Programa média
        int numeroAlunos, contador = 1;
        double nota, media = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número de alunos na turma: ");
        numeroAlunos = input.nextInt();

        while (contador <= numeroAlunos){
            System.out.println("Digite a nota do aluno "+contador+" : ");
            nota = input.nextDouble();
            //media=media+nota
            media += nota;
            contador++;
        }
        media /= numeroAlunos;

        System.out.println("A média da turma é: "+media);
        

        //Programa calcular área de círculo
        double raio, area;

        Scanner valorRecebido = new Scanner(System.in);

        System.out.println("Digite o valor do raio do círculo: ");
        raio = valorRecebido.nextDouble();

        area = Math.PI * Math.pow(raio, 2);
        System.out.println("A área do círculo é: "+area);
        

        //Array
        int[] numeros = {2,4,6,8,10};

        System.out.println("O primeiro elemento é: "+numeros[0]);
        System.out.println("O terceiro elemento é: "+numeros[2]);

        numeros[1] = 5;
        numeros[3] = 9;

        for(int i=0; i<numeros.length; i++){
            System.out.println(numeros[i]);
        }
        

        int[] numeros = {2,4,6,8,10};
        int novoNumero = 12;

        int[] novoArray = new int[numeros.length+1];
        novoArray[numeros.length] = novoNumero;

        for (int i = 0; i<numeros.length; i++){
            novoArray[i] = numeros[i];
        }

        // for (int i = 0; i<novoArray.length; i++){
        //     int n = novoArray[i];
        //     System.out.println(n);
        // }

        for(int n : novoArray){
            System.out.println(n);
        }
        */

        Map<String, String> mapa = new HashMap<>();
        mapa.put("chave1",  "valor1");
        mapa.put("chave2",  "valor2");
        mapa.put("chave3",  "valor3");

        String valorChave1 = mapa.get("chave1");
        System.out.println("O valor da chave1 é: "+valorChave1);

        String valorChave2 = mapa.get("chave2");
        System.out.println("O valor da chave2 é: "+valorChave2);

        for(String chave : mapa.keySet()){
            String valor = mapa.get(chave);
            System.out.println(chave+": "+valor);
        }

    }
}


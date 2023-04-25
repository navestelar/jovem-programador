import java.util.Scanner;

public class Ex04 {
    public static void main (String[] args) throws Exception {
        int altura,maior = 0;
        int menor;
        Scanner input = new Scanner(System.in);
        System.out.println("Escreva a altura da pessoa 1 em metros: ");
        altura = input.nextInt();
        menor = altura;
        while (altura<=0){
            System.out.println("Número inválido");
            System.out.println("Escreva a altura da pessoa 1 em metros: ");
            altura = input.nextInt();
        }
        for (int i = 2; i<=15;i++){
            System.out.println("Escreva a altura da pessoa "+i+" em metros: ");
            altura = input.nextInt();
            while (altura<=0){
                System.out.println("Número inválido");
                System.out.println("Escreva a altura da pessoa "+i+" em metros: ");
                altura = input.nextInt();
            }
            if (altura<menor){
                menor =  altura;
            }
            if (altura>maior){
                maior = altura;
            }
        }
        System.out.println("A menor altura é "+menor+" e a maior altura é "+maior);
        input.close();
    }
}

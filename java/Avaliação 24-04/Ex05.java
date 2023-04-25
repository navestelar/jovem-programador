import java.util.Scanner;

public class Ex05 {
    public static void main (String[] args) throws Exception {
        int code = 0 ;
        float etiqueta = 0;
        System.out.println("Código Condição de Pagamento");
        System.out.println("1. À vista em dinheiro, débitoou pix: 15% de desconto.");
        System.out.println("2. À vista no cartão de crédito: 10% de desconto.");
        System.out.println("3. Em 2x, preço normal sem juros.");
        System.out.println("4. Em 3x, preço da etiqueta mais 10% de juros. ");
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o preço normal da etiqueta: ");
        etiqueta = input.nextFloat();
        System.out.print("Escolha a opção de pagamento: ");
        code = input.nextInt();
        while((code!=1)&&(code!=2)&&(code!=3)&&(code!=4)){
                System.out.println("Digite uma opção válida");
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("Código Condição de Pagamento");
                System.out.println("1. À vista em dinheiro, débitoou pix: 15% de desconto.");
                System.out.println("2. À vista no cartão de crédito: 10% de desconto.");
                System.out.println("3. Em 2x, preço normal sem juros.");
                System.out.println("4. Em 3x, preço da etiqueta mais 10% de juros. ");
                code = input.nextInt();
            }
        if (code == 1 ){
            System.out.println("O valor total a ser pago é: "+(0.85*etiqueta));
        }else if (code == 2) {
            System.out.println("O valor total a ser pago é: "+(0.9*etiqueta));
        }else if (code == 3) {
            System.out.println("O valor total a ser pago é: "+etiqueta+" em 2x sem juros");
        }else if (code == 4){
            System.out.println("O valor total a ser pago é: "+(etiqueta*1.1)+" em 3x com 10% de juros simples");
        }
        input.close();
    }
}

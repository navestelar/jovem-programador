import java.util.Scanner;

public class Ex02 {
    public static void main (String[] args) throws Exception {
        float salario,horasExtras=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Escreva o salário: ");
        salario = input.nextFloat();
        System.out.print("Escreva a quantidade de horas extras: ");
        horasExtras = input.nextFloat();
        input.close();
        System.out.print("Para um salário de R$ ");
        System.out.print(salario);
        System.out.print(", com ");
        System.out.print(horasExtras);
        System.out.print(" horas extras, teremos R$");
        //valor das horas extras
        System.out.print((salario/176)*horasExtras*1.5);
        System.out.print(" de horas extras, R$");
        //se o valor descontado para o INSS for maior que 50
        if ((0.1*(((salario/176)*horasExtras*1.5)+salario))>150){
            //INSS atinge limite de R$150,00
            System.out.print("150,00 de INSS e um salário líquido de ");
            //Salário líquido resultante = salário + horas extras - INSS
            System.out.print(((salario+(salario/176)*horasExtras*1.5))-150);
        }else {
            //INSS = 10% do total
            //total = salário + horas extras
            System.out.print(0.1*(salario+((salario/176)*horasExtras*1.5)));
            System.out.print(" de INSS e um salário líquido de ");
            //100%-10%=90%
            //Salário líquido resultante = salário + horas extras - INSS
            //Salário líquido resultante = 90% do total
            ////Salário líquido resultante = 90% de salário + horas extras
            System.out.print(0.9*(((salario/176)*horasExtras*1.5)+salario));
        }
    }
}

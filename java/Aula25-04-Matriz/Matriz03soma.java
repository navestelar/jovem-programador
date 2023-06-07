<<<<<<< HEAD
public class Matriz03soma {
    public static void main (String[] args) {
        int[][] matriz = {{1,2,3}, {4,5,6}, {7,8,9}};
        int soma = 0;
        //qtd de linhas
        for(int i=0;i<matriz.length;i++){
            //qtd de colunas
            for(int j=0;j<matriz[0].length;j++){
                soma+=matriz[i][j];
            }
        }
        System.out.println("A soma dos elementos da matriz é: "+soma);
    }
=======
public class Matriz03soma {
    public static void main (String[] args) {
        int[][] matriz = {{1,2,3}, {4,5,6}, {7,8,9}};
        int soma = 0;
        //qtd de linhas
        for(int i=0;i<matriz.length;i++){
            //qtd de colunas
            for(int j=0;j<matriz[0].length;j++){
                soma+=matriz[i][j];
            }
        }
        System.out.println("A soma dos elementos da matriz é: "+soma);
    }
>>>>>>> 0033798148f2d50ba623bde7aa2bcc5d332b46a1
}
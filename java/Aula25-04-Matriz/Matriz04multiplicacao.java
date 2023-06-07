public class Matriz04multiplicacao {
    public static void main (String[] args) {
        int[][] a = {{1,2},{3,4}};
        int[][] b ={{5,6},{7,8}};
        int m = a.length;
        int n = a[0].length;
        int p = b[0].length;
        int[][] resultado = new int[m][p];
        for (int i=0;i<m;i++){
            for (int j=0;j<p;j++){
                for (int k=0;k<n ;k++){
                    resultado[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        for (int i=0; i<resultado.length;i++){
            for (int j=0;j<resultado[0].length;j++){
                System.out.print(resultado[i][j]+" ");
            }
            System.out.println();
        }
    }
}


public class Teste {
    public static void main (String[] args){
        
        int[] array = {1,2,3,2,1,5,6};
        int i, inicio = 0;
        int acaba = 0;
        int maiorInicio = 0;
        int maiorAcaba = 0;
        int tamanho = 1;
        int maiorTamanho = 0;
        
        for (i = 1;i<array.length;i++){
            if (array[i]>=array[i-1]){
                acaba = 1;
                tamanho++;
                if (tamanho>maiorTamanho){
                    maiorTamanho = tamanho;
                    maiorInicio = inicio;
                    maiorAcaba = acaba;
                }
            }else {
                inicio = i;
                acaba = i;
                tamanho = 1;
            }
        }

        int[] subarray = new int[maiorTamanho];
        for (i = 0;i<maiorTamanho;i++){
            subarray[i] = array[maiorInicio+1];
        }

        System.out.println(maiorAcaba);
        System.out.println("O maior subarray não descrescente é: ");
        for (i = 0;i<maiorTamanho;i++){
            System.out.print(subarray[i]+" ");
        }
        System.out.println("com comprimento "+maiorTamanho);
    }
}

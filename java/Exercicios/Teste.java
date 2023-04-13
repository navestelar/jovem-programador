import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
public class Teste {
    /**
     * @param args
     * @throws Exception
     */
    public static void main (String[] args) throws Exception{
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
}

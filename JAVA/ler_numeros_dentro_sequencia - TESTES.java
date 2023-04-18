
import java.util.*;
public class ler_numeros_dentro_sequenciaTESTES {
   public static void main (String[] args){
      int bin;
      int a = decimalParaBinario(bin);
      Scanner teclado = new Scanner(System.in);
      
      System.out.print("IP:");
      a = teclado.nextInt();
      
      
      int[] v = {a};
      int contador = contarNegativo(v);
      System.out.println(contador);
   
   }
   private static void decimalParaBinario(int n) {
   
      if (n > 0){
         decimalParaBinario(n / 2);
         System.out.print(n % 2);
      }
   }

   private static int contarNegativo(int[] v) {
      int contador = 0;
   
      for (int x: v) {
         if (x < 0) { contador++;
         }
      }
      return contador;
   }
}
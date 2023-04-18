
import java.util.*;
public class ler_numeros_dentro_sequenciaTESTES {
   public static void main (String[] args){
      Scanner teclado = new Scanner(System.in);
      int bin;
      System.out.print("IP:");
      bin = teclado.nextInt();
      
      int a = decimalParaBinario(bin);
      
     
      
      
      int[] v = {a};
      int contador = contarNegativo(v);
      System.out.println(contador);
   
   }
   private static int decimalParaBinario(int n) {
   
      if (n > 0){
         decimalParaBinario(n % 2);
           
      }
      
      return n;
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
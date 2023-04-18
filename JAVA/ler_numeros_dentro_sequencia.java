
import java.util.*;
public class ler_numeros_dentro_sequencia {
   public static void main (String[] args){
      int a;
      Scanner teclado = new Scanner(System.in);
      
      System.out.print("IP:");
      a = teclado.nextInt();
      
      
      int[] v = {a};
      int contador = contarNegativo(v);
      System.out.println(contador);
   
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
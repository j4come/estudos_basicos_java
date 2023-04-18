import java.util.*;
public class decimal_para_binario {
   public static void main (String[] args){
      decimalParaBinario(20);         
   }
    
   private static void decimalParaBinario(int n) {
   
      if (n > 0){
         decimalParaBinario(n / 2);
         System.out.print(n % 2);
         
      }
      
   }

}

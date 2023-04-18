import java.util.*;
public class jacome3 { 
   public static void main(String[] args) {
   float Num1, Num2, Num3;
   Scanner teclado = new Scanner(System.in) ;
   System.out.print("Primeiro número:");
   Num1 = teclado.nextInt(); 
   System.out.print("Segundo número; será multiplicado pelo primeiro:");
   Num2 = teclado.nextInt();
   System.out.print("Terceiro número; será usado para dividir o resultado da multiplicação:");
   Num3 = teclado.nextInt();     
   float NumMult = Num1 * Num2 ; 
   float NumDiv = NumMult / Num3 ;   
   System.out.printf("O valor da multiplicação do primeiro número pelo segundo informados é: %.2f ", NumMult);
   
   System.out.format("O valor da divisão do resultado anterior pelo terceiro número informado é: %.2f", NumDiv);
   
     
           ;
   }
}
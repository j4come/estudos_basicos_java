import java.util.*;
public class jacome3 { 
   public static void main(String[] args) {
   float Num1, Num2, Num3;
   Scanner teclado = new Scanner(System.in) ;
   System.out.print("Primeiro n�mero:");
   Num1 = teclado.nextInt(); 
   System.out.print("Segundo n�mero; ser� multiplicado pelo primeiro:");
   Num2 = teclado.nextInt();
   System.out.print("Terceiro n�mero; ser� usado para dividir o resultado da multiplica��o:");
   Num3 = teclado.nextInt();     
   float NumMult = Num1 * Num2 ; 
   float NumDiv = NumMult / Num3 ;   
   System.out.printf("O valor da multiplica��o do primeiro n�mero pelo segundo informados �: %.2f ", NumMult);
   
   System.out.format("O valor da divis�o do resultado anterior pelo terceiro n�mero informado �: %.2f", NumDiv);
   
     
           ;
   }
}
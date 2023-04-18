import java.util.*;
public class jacome1 { 
   public static void main(String[] args) {
   float Num1, Num2, Num3;
   Scanner teclado = new Scanner(System.in) ;   
   System.out.print("Qual primeiro número?");
   Num1 = teclado.nextFloat () ;
   System.out.print("Qual segundo número?");
   Num2 = teclado.nextFloat () ;
   System.out.print("Qual terceiro número?");
   Num3 = teclado.nextFloat () ;
   float Soma = Num1 + Num2 + Num3;
   float Media = Soma / 3 ; // a média só deu pq eu transformei o resultado da soma em variável "soma", o calculo direto não deu (pq?)
   System.out.printf("A soma destes numeros é %.2f e a média da soma desses números é %.2f", Soma, Media);
     
           ;
   }
}
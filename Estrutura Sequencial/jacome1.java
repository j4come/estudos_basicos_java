import java.util.*;
public class jacome1 { 
   public static void main(String[] args) {
   float Num1, Num2, Num3;
   Scanner teclado = new Scanner(System.in) ;   
   System.out.print("Qual primeiro n�mero?");
   Num1 = teclado.nextFloat () ;
   System.out.print("Qual segundo n�mero?");
   Num2 = teclado.nextFloat () ;
   System.out.print("Qual terceiro n�mero?");
   Num3 = teclado.nextFloat () ;
   float Soma = Num1 + Num2 + Num3;
   float Media = Soma / 3 ; // a m�dia s� deu pq eu transformei o resultado da soma em vari�vel "soma", o calculo direto n�o deu (pq?)
   System.out.printf("A soma destes numeros � %.2f e a m�dia da soma desses n�meros � %.2f", Soma, Media);
     
           ;
   }
}
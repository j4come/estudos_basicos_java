import java.util.*;
public class jacome19 { 
   public static void main(String[] args) {
   double NumeroP;
   Scanner teclado = new Scanner(System.in) ;
   System.out.print("Digite um n�mero postivo :");
   NumeroP = teclado.nextDouble();   
  double Quadrado = Math.pow(NumeroP, 2);
  double Cubo = Math.pow(NumeroP, 3);  
  double Raiz =  Math.sqrt(NumeroP);
     
   System.out.format("O resultado da eleva��o ao quadrado �: %.1f", Quadrado);
   System.out.format("O resultado da eleva��o ao cubo �: %.0f", Cubo); 
   System.out.format("A raiz quadrada deste n�mero �: %.2f", Raiz); 
   
   
   // O n�mero digitado elevado ao quadrado; O n�mero digitado elevado ao cubo; A raiz quadrada do n�mero;
   // A raiz c�bica do n�mero. 
        
     
           ;
   }
}
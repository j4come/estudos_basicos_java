import java.util.*;
public class jacome19 { 
   public static void main(String[] args) {
   double NumeroP;
   Scanner teclado = new Scanner(System.in) ;
   System.out.print("Digite um número postivo :");
   NumeroP = teclado.nextDouble();   
  double Quadrado = Math.pow(NumeroP, 2);
  double Cubo = Math.pow(NumeroP, 3);  
  double Raiz =  Math.sqrt(NumeroP);
     
   System.out.format("O resultado da elevação ao quadrado é: %.1f", Quadrado);
   System.out.format("O resultado da elevação ao cubo é: %.0f", Cubo); 
   System.out.format("A raiz quadrada deste número é: %.2f", Raiz); 
   
   
   // O número digitado elevado ao quadrado; O número digitado elevado ao cubo; A raiz quadrada do número;
   // A raiz cúbica do número. 
        
     
           ;
   }
}
import java.util.*;
public class jacome17 { 
   public static void main(String[] args) {
   double  NumReal;
   Scanner teclado = new Scanner(System.in) ;
   System.out.print("Qual n�mero real?");
   NumReal = teclado.nextDouble();
   double Resto = NumReal % 1;
   double NumInt = NumReal - Resto;
        
   System.out.format("O inteiro �:"+NumInt);
   System.out.format("e a sobra � %.3f",Resto);  
   
   // % ---> coloca os restos da divis�o, dentro da vari�vel
  
        
     
           ;
   }
}
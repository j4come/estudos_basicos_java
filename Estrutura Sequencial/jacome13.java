import java.util.*;
public class jacome13 { 
   public static void main(String[] args) {
   int  AnoAtual;
   Scanner teclado = new Scanner(System.in) ;
   System.out.print("Qual ano n�s estamos?");
   AnoAtual = teclado.nextInt();
   int AnosCopa = (AnoAtual - 1930) / 4;
   int CopasGuerras = AnosCopa - 2 + 1;
        
   System.out.format("O n�mero de copas que aconteceram foi "+CopasGuerras+"!");
  
        
     
           ;
   }
}
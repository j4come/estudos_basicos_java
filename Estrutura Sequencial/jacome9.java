import java.util.*;
public class jacome9 { 
   public static void main(String[] args) {
   int NumLados; 
   Scanner teclado = new Scanner(System.in) ;
   System.out.print("Quantos lados tem seu pol�gono?");
   NumLados = teclado.nextInt();
   int Diagonais = NumLados * (NumLados - 3) / 2;         // ND = N*(N � 3)/2,
  
     
   System.out.println("O n�mero de Diagonais corresponde a " +Diagonais);
      
        
     
           ;
   }
}
import java.util.*;
public class jacome14 { 
   public static void main(String[] args) {
   double  AreaVertical, AreaHorizontal;
   Scanner teclado = new Scanner(System.in) ;
   System.out.print("Qual a �rea Vertical?");
   AreaVertical = teclado.nextDouble();
   System.out.print("Qual a �rea Horizontal?");
   AreaHorizontal = teclado.nextDouble();
   double AreaQuarto = AreaVertical * AreaHorizontal;
   double Potencia = AreaQuarto * 18;
        
   System.out.format("A quantidade de pot�ncia necess�ria �"+Potencia+"W!");
  
        
     
           ;
   }
}
import java.util.*;
public class jacome21 { 
   public static void main(String[] args)
    {
   double MetroParede, AnguloEsc;
   Scanner teclado = new Scanner(System.in) ;
   System.out.print("Qual cumprimento da parede em metros?");
   MetroParede = teclado.nextDouble();
   System.out.print("Qual �ngulo da escada?");
   AnguloEsc = teclado.nextDouble(); 
   
  double MetroEsc = MetroParede / AnguloEsc;
     
   System.out.format("Sua escada dever� ter %.0f Metros!", MetroEsc);
   
 
   

        
     
           ;
   }
}
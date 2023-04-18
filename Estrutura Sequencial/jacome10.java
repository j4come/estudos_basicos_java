import java.util.*;
public class jacome10 { 
   public static void main(String[] args) {
   double Capital = 2000;
   double Juros = 0.5;
   double TempoMeses = 2.4;  
   double Montante = Capital * (1 + Juros);
   double Montante2 = Math.pow (Montante, TempoMeses);
   double Total = Montante2 + Capital;
            // M = C (1+i)t - M: Montante, C: Capital; i:taxa, t:tempo ----> o ^ não esta elevando/ elevou Math.pow (Montante, TempoMeses)
  
     
   System.out.println("O montante acumulado é de $" +Total);
      
        
     
           ;
   }
}
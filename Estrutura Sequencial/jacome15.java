import java.util.*;
public class jacome15 { 
   public static void main(String[] args) {
   float  Raio;
   Scanner teclado = new Scanner(System.in) ;
   System.out.print("Qual o raio a ser calculado?");
   Raio = teclado.nextFloat();
   final double PI = 3.1416;
   double  Diametro = Raio * 2; 
   double Circ = Diametro * PI;
        
   System.out.format("O resultado é %.2f",Circ, Circ); // lembrar que o %1.f no print format serve para double tbm!
  
        
     
           ;
   }
}
import java.util.*;
public class jacome12 { 
   public static void main(String[] args) {
   double  Rua1, Rua2, Rua3, MetrosMeta;
   Scanner teclado = new Scanner(System.in) ;
   System.out.print("Qual sua meta em KM?");
   MetrosMeta = teclado.nextFloat();
   System.out.print("Qual o valor da Rua 1?");
   Rua1 = teclado.nextFloat();
   System.out.print("Qual o valor da Rua 2?");
   Rua2 = teclado.nextFloat(); 
   System.out.print("Qual o valor da Rua 3?");
   Rua3 = teclado.nextFloat();         
   double  TotalMetros = Rua1 + Rua2 + Rua3;
   double  Voltas = Math.ceil(MetrosMeta / TotalMetros);
  
     
   System.out.format("A  precisa dar de voltas que você precisa dar é: . "+Voltas);
  
        
     
           ;
   }
}
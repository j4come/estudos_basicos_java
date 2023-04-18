import java.util.*;
public class jacome5 { 
   public static void main(String[] args) {
   double SalarioBase;
   Scanner teclado = new Scanner(System.in) ;
   System.out.print("Digite aqui sua nota peso 2:");
   SalarioBase = teclado.nextDouble();     
   double Gratificacao = (SalarioBase * 10) / 100 ; 
   double SalarioGratificacao = SalarioBase + Gratificacao ; 
   double Imposto = (SalarioGratificacao * 5) / 100;
   double SalarioFinal = SalarioGratificacao - Imposto;  
   System.out.println("Seu salário final (+ 10% [gratificação] / - 5% [imposto]) é:  " +SalarioFinal);
   
   
     
           ;
   }
}
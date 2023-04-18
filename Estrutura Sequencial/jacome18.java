import java.util.*;
public class jacome18 { 
   public static void main(String[] args) {
   double SalarioMinimo, QuilowattsConsumo;
   Scanner teclado = new Scanner(System.in) ;
   System.out.print("Qual o valor do salário minimo?");
   SalarioMinimo = teclado.nextDouble();
   System.out.print("Qual a quantidade de quilowatts?");
   QuilowattsConsumo = teclado.nextDouble();         
   double CemQuilowatts = SalarioMinimo / 5;
   double ValorPagoQuilowatts = CemQuilowatts / 100;
   double ValorTotal = QuilowattsConsumo * ValorPagoQuilowatts;
   double Desconto = 15 * ValorTotal / 100;
   double ValorComDesconto = ValorTotal - Desconto;
     
   System.out.format("O valor pago por quilowatts é %.0f reais! ", ValorPagoQuilowatts);
   System.out.format("O valor total pago é %.0f reais!", ValorTotal); 
   System.out.println("O valor pago com desconto é: " +ValorComDesconto);  
        
     
           ;
   }
}
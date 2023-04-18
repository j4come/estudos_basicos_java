import java.util.*;
public class jacome6 { 
   public static void main(String[] args) {
   double SalarioBase, QntVendas;
   Scanner teclado = new Scanner(System.in) ;
   System.out.print("Qual valor do seu salário?");
   SalarioBase = teclado.nextDouble();
   System.out.print("Qual a sua quantidade de vendas?");
   QntVendas = teclado.nextDouble();         
   double Comissao = (SalarioBase * 4) / 100 ; 
   double ComissaoTotal = (QntVendas * Comissao) ;  
   double SalarioComissao = SalarioBase + ComissaoTotal;
   System.out.println("O valor da comissão à receber esse mês é: " +ComissaoTotal);
   System.out.println("Sendo seu salário total o valor de: " +SalarioComissao);   
        
     
           ;
   }
}
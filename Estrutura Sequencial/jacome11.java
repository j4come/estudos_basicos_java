import java.util.*;
public class jacome11 { 
   public static void main(String[] args) {
   float Salario, Conta1, Conta2;
   Scanner teclado = new Scanner(System.in) ;
   System.out.print("Qual valor do seu salário?");
   Salario = teclado.nextFloat();
   System.out.print("Qual o valor da primeira conta?");
   Conta1 = teclado.nextFloat(); 
   System.out.print("Qual o valor da segunda conta?");
   Conta2 = teclado.nextFloat();         
   float Multa = (Conta1 + Conta2) * 2 / 100;
   float Sobra = Salario - (Conta1 + Conta2 + Multa); 
     
   System.out.println("O valor de sobra é $ " +Sobra);
  
        
     
           ;
   }
}
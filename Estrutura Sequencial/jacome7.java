import java.util.*;
public class jacome7 { 
   public static void main(String[] args) {
   double Base, Altura;
   Scanner teclado = new Scanner(System.in) ;
   System.out.print("Vamos calcular a Área e Perimetro do seu retângulo, para começar... Qual o valor da base?");
   Base = teclado.nextDouble();
   System.out.print("Qual o valor da altura?");
   Altura = teclado.nextDouble();         
   double Area = Base * Altura ;
   double Perimetro = 2* (Base + Altura);
     
   System.out.println("O valor da Área é: " +Area);
   System.out.println("O valor do Perimetro é: " +Perimetro);   
        
     
           ;
   }
}
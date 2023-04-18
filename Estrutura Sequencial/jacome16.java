import java.util.*;
public class jacome16 { 
   public static void main(String[] args) {
   int  Minutos;
   Scanner teclado = new Scanner(System.in) ;
   System.out.print("Quantidade de minutos?");
   Minutos = teclado.nextInt();
   float Horas = Minutos / 60;
   float MinutosFinais = Minutos % 60;
        
   System.out.format("O horário é %.0f e %.0f minutos!",Horas, MinutosFinais);
   
   // % ---> coloca os restos da divisão, dentro da variável
  
        
     
           ;
   }
}
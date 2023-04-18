import java.util.*;
public class jacome4 { 
   public static void main(String[] args) {
   double NotaPeso2, Nota1Peso1, Nota2Peso1;
   Scanner teclado = new Scanner(System.in) ;
   System.out.print("Digite aqui sua nota peso 2:");
   NotaPeso2 = teclado.nextDouble(); 
   System.out.print("Digite aqui sua Primeira nota peso 1:");
   Nota1Peso1 = teclado.nextDouble();
   System.out.print("Digite aqui sua segunda nota peso 1:");
   Nota2Peso1 = teclado.nextDouble();     
   double NotaTotal = NotaPeso2 + Nota1Peso1 + Nota2Peso1 ; 
   double NotaMedia = NotaTotal / 4 ;   
   System.out.println("Sua nota média (somatória de todas as notas, dividido pelo total dos pesos das respectivas notas) é:  " +NotaMedia);
   
   
     
           ;
   }
}
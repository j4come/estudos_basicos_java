import java.util.*;
public class jacome20 { 
   public static void main(String[] args)
    {
   double SalarioMin, HorasTrab, HorasExtra;
   Scanner teclado = new Scanner(System.in) ;
   System.out.print("Quanto esta o valor do salário minimo?");
   SalarioMin = teclado.nextDouble();
   System.out.print("Quantas horas não extras você trabalhou?");
   HorasTrab = teclado.nextDouble(); 
   System.out.print("Quantas horas extras você trabalhou?");
   HorasExtra = teclado.nextDouble(); 
  double HorasValor = SalarioMin * 0.125;
  double HorasExtValor = SalarioMin * 0.25;
  double HorasTrabPago = HorasTrab * HorasValor; // saída
  double HorasExtPago =   HorasExtra * HorasExtValor; // saída
  double SalarioTotal = HorasTrabPago + HorasExtPago; //saída

     
   System.out.format("Para suas horas trabalhadas você receberá o total de $ %.2f", HorasTrabPago);
   
   System.out.format("Para suas horas extras trabalhadas você receberá o total de $ %.2f", HorasExtPago); 
   
   System.out.format("Desta forma, o seus rendimentos totais serão $ %.2f", SalarioTotal); 
   
   
  // 20. Faça um algoritmo que receba o número de horas trabalhadas, o valor do salário mínimo e o número de
// horas extras trabalhadas. Calcule e mostre o salário a receber seguindo as seguintes regras:
// a) O valor a ser pago por hora trabalhada é 0.125 do salário mínimo;
// b) O valor a ser pago por hora extra vale 0.25 do salário mínimo;
// c) o salário bruto equivale ao número de horas trabalhadas vezes o valor pago por hora;
// d) a quantia a receber por horas extras equivale à horas extras realizadas multiplicado pelo valor pago
// por hora extra;
// e) o salário a receber equivale à soma do salário bruto mais a quantia a receber pelas horas extras.
        
     
           ;
   }
}
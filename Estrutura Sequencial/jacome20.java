import java.util.*;
public class jacome20 { 
   public static void main(String[] args)
    {
   double SalarioMin, HorasTrab, HorasExtra;
   Scanner teclado = new Scanner(System.in) ;
   System.out.print("Quanto esta o valor do sal�rio minimo?");
   SalarioMin = teclado.nextDouble();
   System.out.print("Quantas horas n�o extras voc� trabalhou?");
   HorasTrab = teclado.nextDouble(); 
   System.out.print("Quantas horas extras voc� trabalhou?");
   HorasExtra = teclado.nextDouble(); 
  double HorasValor = SalarioMin * 0.125;
  double HorasExtValor = SalarioMin * 0.25;
  double HorasTrabPago = HorasTrab * HorasValor; // sa�da
  double HorasExtPago =   HorasExtra * HorasExtValor; // sa�da
  double SalarioTotal = HorasTrabPago + HorasExtPago; //sa�da

     
   System.out.format("Para suas horas trabalhadas voc� receber� o total de $ %.2f", HorasTrabPago);
   
   System.out.format("Para suas horas extras trabalhadas voc� receber� o total de $ %.2f", HorasExtPago); 
   
   System.out.format("Desta forma, o seus rendimentos totais ser�o $ %.2f", SalarioTotal); 
   
   
  // 20. Fa�a um algoritmo que receba o n�mero de horas trabalhadas, o valor do sal�rio m�nimo e o n�mero de
// horas extras trabalhadas. Calcule e mostre o sal�rio a receber seguindo as seguintes regras:
// a) O valor a ser pago por hora trabalhada � 0.125 do sal�rio m�nimo;
// b) O valor a ser pago por hora extra vale 0.25 do sal�rio m�nimo;
// c) o sal�rio bruto equivale ao n�mero de horas trabalhadas vezes o valor pago por hora;
// d) a quantia a receber por horas extras equivale � horas extras realizadas multiplicado pelo valor pago
// por hora extra;
// e) o sal�rio a receber equivale � soma do sal�rio bruto mais a quantia a receber pelas horas extras.
        
     
           ;
   }
}
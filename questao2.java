
import java.util.Scanner;


public class questao2 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("informe um número decimal: ");
         float numero1 = input.nextFloat();
         System.out.print("informe outro número decimal: ");
         float numero2 = input.nextFloat();
         float soma = numero1 + numero2;
         System.out.println("A soma destes números é: " + soma );
    }
}

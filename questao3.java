
import java.util.Scanner;

public class questao3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("insira o primeiro número: ");
        int numero1 = input.nextInt();
        System.out.print("insira o segundo número: ");
        int numero2 = input.nextInt();
        int divisao = numero1/numero2;
        float restoDivisao = numero1%numero2;
        System.out.println("a divisao desses dois números é: "+divisao+" e o resto é: "+restoDivisao);
      
        
    }
}
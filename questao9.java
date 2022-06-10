
import java.util.Scanner;


public class questao9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.print("Informe a cotação do dólar atual: ");
            float cotacaodolar = input.nextFloat();
            System.out.print("Informe um valor em reais: ");
            float real = input.nextFloat();
            System.out.println("A converção desse valor para dolar é igual: $"+(real/cotacaodolar));
        
        
    }
}


import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("insira a quantidade de metros que devem ser convertidos: ");
        float metro1 = input.nextFloat();
        double polegadas = metro1 * 39.3700787;
        System.out.println(metro1+" metros convertidos em polegadas são: "+polegadas+" polegadas");
    }     
}

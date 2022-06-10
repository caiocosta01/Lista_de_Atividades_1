
import java.util.Scanner;


public class questao10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("informe uma quantidade de minutos: ");
        int minutos = input.nextInt();
        System.out.println(minutos+" minutos convertido em segundos: "+(minutos*60));
        
    }
}

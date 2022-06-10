
import java.util.Scanner;


public class questao13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("informe um tempo em minutos: ");
        float tempo = input.nextFloat();
        tempo = tempo*60;
        double altura = 20.2*(tempo*tempo)/2;
        System.out.println("a altura em metros da pedra com o tempo informado é: "+altura+" m");
        
    }
    
}

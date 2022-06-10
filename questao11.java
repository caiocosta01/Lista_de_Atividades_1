
import java.util.Scanner;


public class questao11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("informe uma quatidade de horas: ");
        int horas = input.nextInt();
        float minutos = horas*60;
        float segundos = minutos*60;
        System.out.println(horas+" horas convertidas em segundos são: "+segundos+" segundos");
        
    }
    
}

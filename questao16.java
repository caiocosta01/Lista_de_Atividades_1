
import java.util.Scanner;


public class questao16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe um número: ");
        float numero1 = input.nextFloat();
        float divisao = numero1%2;
        if(divisao != 0){
            System.out.println("Este número é impar!");
        }
        else{
            System.out.println("ESte número é par!");
        }
    }
    
}

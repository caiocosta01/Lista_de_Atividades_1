
import java.util.Scanner;


public class questao14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe um número inteiro: ");
        int numero1 = input.nextInt();
        System.out.print("Informe outro número inteiro: ");
        int numero2 = input.nextInt();
        if(numero1>numero2){
            System.out.println(numero1+" é maior que "+numero2);
        }
        else if(numero2>numero1){
            System.out.println(numero2+" é maior que "+numero1);
        }
        else if(numero1==numero2){
            System.out.println("Os números informados são iguais!");
        }
        
    
    }
}

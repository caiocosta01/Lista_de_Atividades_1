
import java.util.Scanner;

public class questao20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("informe um número inteiro: ");
        int numero1 = input.nextInt();
        System.out.print("informe um número inteiro: ");
        int numero2 = input.nextInt();
        System.out.print("informe um número inteiro: ");
        int numero3 = input.nextInt();
        
        if (numero1 < numero2 && numero1 < numero3){
            System.out.println("O menor número é o "+numero1);
        }
        else if (numero2<numero3 && numero2<numero1){
            System.out.println("o menor número é o "+numero2);
        }
        else if (numero3<numero2 && numero3<numero1){
            System.out.println("o menor número é o "+numero3);
        }
        else if (numero1 == numero2 && numero1 == numero3){
            System.out.println("Os números informados são iguais!");
        }
        
    }
    
}


import java.util.Scanner;


public class questao18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int senha = 1234;
        System.out.print("Informe a senha: ");
        int senhaDigitada = input.nextInt();
        String codigo = (senha==senhaDigitada)?"SENHA VALIDA":"SENHA INVALIDA";
        System.out.println(codigo);
    }
    
}

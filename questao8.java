
import java.util.Scanner;


public class questao8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("informe seu nome: ");
        String nome = input.nextLine();
        System.out.print("informe seu sobrenome: ");
        String sobrenome = input.nextLine();
        System.out.print("informe seu endereço (rua e número): ");
        String endereco = input.nextLine();
        System.out.print("informe sua cidade: ");
        String cidade = input.nextLine();
        System.out.print("informe o estado onde você mora: ");
        String estado = input.nextLine();
        System.out.println("Nome: "+nome+" "+sobrenome);
        System.out.println("Endereço: "+endereco+" - "+cidade+" - "+estado);
        
        
        
    }
}

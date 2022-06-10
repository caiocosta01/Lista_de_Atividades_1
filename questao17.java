import java.util.Scanner;


public class questao17 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Informe sua idade atual: ");
        int idade = input.nextInt();
        if (idade>=16){
            System.out.println("Você poderá votar esse ano!");
        }
        else{
            System.out.println("Você não poderá votar esse ano!");
        }
        
    }
    
}
import java.util.Scanner;


public class questao19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe a quantidade de laranjas que você deseja comprar: ");
        int laranja = input.nextInt();
        if(laranja<12){
            double compra = laranja*0.50; 
            System.out.printf("o valor total da compra foi de: R$ %.2fR$", compra);
        }
        else if (laranja >= 12){
            double compra = laranja*0.30;
            System.out.printf("o valor total da compra foi de: R$ %.2f", compra);
        }
    }
            
}

    


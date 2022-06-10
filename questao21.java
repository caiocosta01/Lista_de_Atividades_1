
import java.util.Scanner;


public class questao21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("informe a medida do primeiro lado do triangulo: ");
        float lado1 = input.nextFloat();
        System.out.print("informe a medida do segundo lado do triangulo: ");
        float lado2 = input.nextFloat();
        System.out.print("informe a medida do terceiro lado do triangulo: ");
        float lado3 = input.nextFloat();
        
        if (lado1==lado2 && lado2==lado3){
            System.out.println("Triângulo Equilátero");
        }
        else if (lado1 != lado2 && lado1 != lado3 ){
            System.out.println("Triangulo Escaleno");
        }
        else if(lado1 == lado2 || lado2==lado3 || lado1==lado3){
            System.out.println("Triângulo Isóceles");
        }  
    }
}



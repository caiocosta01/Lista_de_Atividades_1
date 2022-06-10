
import java.util.Scanner;


public class questao15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe seu peso em quilos: ");
        float peso = input.nextFloat();
        System.out.print("Informe sua altura: ");
        float altura = input.nextFloat();
        float imc = peso/(altura*altura);
        if(imc<18.5){
            System.out.println("Magreza");
        }
        else if(imc>=18.5 && imc<=24.9){
            System.out.println("saudável");
        }
        else if(imc>=25.0 && imc<=29.9){
            System.out.println("Sobrepeso");
        }
        else if(imc>=30.0 && imc<=34.9){
            System.out.println("Obeside Grau 1");
        }
        else if(imc>=35.0 && imc<=39.9){
            System.out.println("Obesidade Grau 2 (severa)");
        }
        else if(imc>=40.0){
            System.out.println("Obsidade Grau 3 (morbida)");
        }
            
               
    
            
            }        
}

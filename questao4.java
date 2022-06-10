

import java.util.Scanner;

public class questao4 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("informe a primeira nota do aluno: ");
         float nota1 = input.nextFloat();
         System.out.print("informe a segunda nota do aluno: ");
         float nota2 = input.nextFloat();
         System.out.print("informe a terceira nota do aluno: ");
         float nota3 = input.nextFloat();
         System.out.print("informe a quarta nota do aluno: ");
         float nota4 = input.nextFloat();
         float soma = nota1+nota2+nota3+nota4;
         float media = soma/4;
         System.out.println("a média deste aluno é: "+media);
         
     }
    
}



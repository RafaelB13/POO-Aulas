
package exerciciosAula02;

import java.util.Scanner;


public class Exercicio05 {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Insira seu nome:   ");
        String nome = scn.next();
        System.out.print("Insira sua idade:  ");
        int idade = scn.nextInt();
        
        int resultado = idade++;
        
        System.out.println(nome + ", em 2020 você estará com " + resultado);
        
        
        
    }
    
}

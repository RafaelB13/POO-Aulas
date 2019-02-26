package exerciciosAula02;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);
        
        
        System.out.print("Insira um número:  ");
        int n = scn.nextInt();
        
        System.out.println("Tabuada de "+n);
        for (int i = 0; i < 11; i++) {
            
            System.out.println(n+" x " + i + " = " + n*i);
        }

    }

}

package exerciciosAula02;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        double fahrenheit;
        double celsius;

        Scanner scn = new Scanner(System.in);

        System.out.print(("Insira a temperatura em fahrenheit: "));
        fahrenheit = scn.nextDouble();

        System.out.print("Insira a temperatura em celsius: ");
        celsius = scn.nextDouble();

        double CelsiusToFahrenheit = (celsius * 9 / 5) + 32;
        double FahrenheitToCelsius = (fahrenheit - 32) * 5 / 9;

        System.out.println(celsius + "° Celsius é o mesmo que " + CelsiusToFahrenheit + "° Fahrenheit");

        System.out.println(fahrenheit + "° Fahrenheit é o mesmo que " + FahrenheitToCelsius + "° Celcius");

    }

}

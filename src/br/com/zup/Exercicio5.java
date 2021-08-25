package br.com.zup;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        //Para converter Fahrenheit para Celsius, devemos subtrair 32 e multiplicar por 1,8.

        Scanner input = new Scanner(System.in);

        float fahrenheit;
        //(76 °F − 32) × 5/9 = 24 °C

        System.out.println("Olá vamos verificar qual a temperatura em Celsius?");
        System.out.println("Por gentileza, digite o valor que aparece no seu termômetro em Fahrenheit");
        fahrenheit = input.nextFloat();
        float celsius =  (fahrenheit - 32) * 5 / 9 ;
        System.out.println("Ok, computei sua resposta, o grau em celsius que correspondente a " + fahrenheit + " Fahreheint é: " + celsius);

    }
}

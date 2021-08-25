package br.com.zup;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner metroDigitado = new Scanner(System.in);

        //Para convertermos metros para centímetros, precisamos multiplicar o número representado em metros por 100.

        double metro1;
        double centimetro = 100;

        System.out.println("Olá, vamos calcular quantos centímetro existe em metros variados?");
        System.out.println("Digite uma metragem aleatória:");
        metro1 = metroDigitado.nextDouble();

        double resultado = metro1 * centimetro;

        System.out.println("A quantidade de centímetros é:");
        System.out.println(resultado);
    }
}

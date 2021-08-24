package br.com.zup;

public class Exercicio5 {
    public static void main(String[] args) {

        //Para converter Fahrenheit para Celsius, devemos subtrair 32 e multiplicar por 1,8.
        float fahrenheit = 76;
        //(76 °F − 32) × 5/9 = 24 °C

        float celsius =  (fahrenheit - 32) * 5 / 9 ;

        System.out.println("O grau em celsius que correspondente a 76 Fahrenheit é: " + celsius);

    }
}

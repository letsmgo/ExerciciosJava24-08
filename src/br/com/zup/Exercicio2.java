package br.com.zup;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner notas = new Scanner(System.in);



        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double soma;
        double media;

        System.out.println("Vamos calcular a média das suas notas?");
        System.out.println("Por favor, digite a primeira nota:");
        nota1 = notas.nextDouble();
        System.out.println("Por favor, digite a segunda nota:");
        nota2 = notas.nextDouble();
        System.out.println("Por favor, digite a terceira nota:");
        nota3 = notas.nextDouble();
        System.out.println("Por favor, digite a quarta nota:");
        nota4 = notas.nextDouble();

        soma = nota1 + nota2 + nota3 + nota4;
        media = soma / 4;

        System.out.println("De acordo com as informações que vc digitou sua média final é: " + media);


    }
}

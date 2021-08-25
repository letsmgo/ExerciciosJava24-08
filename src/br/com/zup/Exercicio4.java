package br.com.zup;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner horasTrabalhadas = new Scanner(System.in);
        Scanner salarioHora = new Scanner(System.in);
        double horasMes;

        System.out.println("Olá! Sou seu assistente para cálculo salarial");
        System.out.println("Digite por gentileza quantas horas foram trabalhadas neste mês");
        horasMes = horasTrabalhadas.nextDouble();
        System.out.println("Ok, agora preciso que você digite o valor que você ganha por hora");
        double salarioPorHora;
        salarioPorHora = salarioHora.nextDouble();
        System.out.println("Computei suas informações, e baseado nelas, seu salário será:");
        double salarioBruto = horasMes * salarioPorHora;
        System.out.println("R$" + salarioBruto);

    }
}

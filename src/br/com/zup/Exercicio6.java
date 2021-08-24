package br.com.zup;

public class Exercicio6 {
    public static void main(String[] args) {
        //Faça um Programa que receba o quanto você ganha por hora e o número de
        //horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido
        //mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o
        //INSS e 5% para o sindicato, faça um programa que nos dê respectivamente:
        //d. Qual o salário líquido do funcionário.

        float qtdDeHorasTrabalhadas = 30;
        float salarioPorHora = 150.9F;
        float salarioBruto = qtdDeHorasTrabalhadas * salarioPorHora;
        float impostoDeRendaPercentual = salarioBruto * 11 / 100;
        float inssPercentual = salarioBruto * 8 / 100;
        float sindicatoPercentual = salarioBruto * 5 / 100;
        float valorFinalSalario = salarioBruto - impostoDeRendaPercentual - inssPercentual - sindicatoPercentual;

        System.out.println("A = O seu salário bruto neste mês foi: R$" + salarioBruto);
        System.out.println("B = Deste valor foi repassado ao INSS: R$" + inssPercentual);
        System.out.println("C = Deste valor foi repassado ao SINDICATO R$" + sindicatoPercentual);
        System.out.println("D = Deste modo o valor líquido a receber será de: R$" + valorFinalSalario);
    }
}

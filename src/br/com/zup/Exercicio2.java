package br.com.zup;

public class Exercicio2 {
    public static void main(String[] args) {

        float primeiroBimestre = 10;
        float segundoBimestre = 8.8F;
        float terceiroBimestre = 9.4F;
        float quartoBimestre = 10;
        float totalDeNotasAvaliadas = 4;
        float totalDosBimestres = primeiroBimestre + segundoBimestre + terceiroBimestre + quartoBimestre;
        float mediaAritmetica = totalDosBimestres / totalDeNotasAvaliadas;

        System.out.println("A média das notas do ano letivo foi: " + mediaAritmetica);

    }
}

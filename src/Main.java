import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*Dado um determinado salarario, eu quero saber qual o valor que eu tenho que pegar
        * dado determinado salario anual eu quero saber o valor que eu vou ter que pagar
        * up to € 75,518	36,97% (36,93% in 2023)
          from € 75,518	49,50% (same as in 2023) */

        double valorAnual, valorMensal, valorDiario, valorSemanal;
        int escolhaUsu;
        double resultado;
        System.out.println("Insira de que forma você deseja informar o seu salário: ");
        System.out.println("Diario(1) Semanal(2) Mensal(3) Anual(4)");
        Scanner input = new Scanner(System.in);
        escolhaUsu = input.nextInt();

        switch (escolhaUsu) {

            case 1:
                System.out.println("Digite o seu salário diário: ");
                valorDiario = input.nextDouble();
                resultado = calculaDiario(valorDiario);
                System.out.println("O seu salário de: " + valorDiario + " por dia, com os impostos ficara de: " + resultado + " por ano");
                break;
            case 2:
                System.out.println("Digite o seu salário semanal: ");
                valorSemanal = input.nextDouble();
                resultado = calculaSemanal(valorSemanal);
                System.out.println("O seu salário de: " + valorSemanal + " por semana, com os impostos ficara de: " + resultado + " por ano");
                break;
            case 3:
                System.out.println("Digite o seu salário mensal: ");
                valorMensal = input.nextDouble();
                resultado = calculaMensal(valorMensal);
                System.out.println("O seu salário de: " + valorMensal + " por mês, com os impostos ficara de: " + resultado + " por ano");
                break;
            case 4:
                System.out.println("Digite o seu salário anual: ");
                valorAnual = input.nextDouble();
                resultado = calculaAnual(valorAnual);
                System.out.println("O seu salário de: "+ valorAnual +" por ano, com os impostos ficara de: "+ resultado+" por ano");
            default:
                System.out.println("Resposta inválida! insira outra resposta...");

        }


    }

    public static double calculaDiario(double valorDiario) {
        /*necessidade: multiplicar por 30, 12 taxa */
        double resultado;
        resultado = ((valorDiario * 30) * 12);
        if (resultado <= 75518) {
            resultado = (resultado * 36.97) / 100;
        } else if (resultado > 75518) {
            resultado = (resultado * 49.50) / 100;
        }


        return resultado;
    }

    public static double calculaSemanal(double valorSemanal) {

        double resultado;
        resultado = ((valorSemanal * 4) * 12);
        if (resultado <= 75518) {
            resultado = (resultado * 36.97) / 100;
        } else if (resultado > 75518) {
            resultado = (resultado * 49.50) / 100;
        }


        return resultado;

    }

    public static double calculaMensal(double valorMensal) {

        double resultado;
        resultado = (valorMensal * 12);
        if (resultado <= 75518) {
            resultado = (resultado * 36.97) / 100;
        } else if (resultado > 75518) {
            resultado = (resultado * 49.50) / 100;
        }

        return resultado;
    }

    public static double calculaAnual(double valorAnual) {

        double resultado;
        resultado = valorAnual;
        if (resultado <= 75518) {
            resultado = (resultado * 36.97) / 100;
        } else if (resultado > 75518) {
            resultado = (resultado * 49.50) / 100;
        }

        return resultado;

    }
}
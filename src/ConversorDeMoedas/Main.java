package ConversorDeMoedas;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    ConversorDeMoedas conversor = new ConversorDeMoedas(new BigDecimal("5.43"),new BigDecimal("4.21"),
            new BigDecimal("6.22"),new BigDecimal("7.34"));

    while (true) {


        System.out.println("Bem vindo ao conversor de moedas.");
        System.out.println("Escolha no menu, qual moeda a ser convertida: ");

        System.out.println("===== Menu =====");
        System.out.println("1. Dólar americano");
        System.out.println("2. Dólar canadense");
        System.out.println("3. Euro");
        System.out.println("4. Libra Esterlina");
        System.out.println("5. Encerrar o processo");
        System.out.println("Escolha uma opção: ");


        try {
            System.out.println("O programa só sabe converter dinheiro para Real (R$)");
            System.out.println("Digite o valor a ser convertido:");

            String valor = entrada.nextLine();
            BigDecimal valorConver = new BigDecimal(valor);

            if (valor.compareTo(String.valueOf(BigDecimal.ZERO)) <= 0) {
                System.out.println("Valor inválido, por favor, tente novamente");
                continue;
            }

            BigDecimal coversor = conversor.converterParaReal(moeda,valor);

            System.out.printf("O valor que pediu para converter de %s em reais é R$%.2f%n", valor, valorConver);
        } catch (NumberFormatException e) {
            System.out.println("Para moeda, o valor monetário deve ser um número decimal");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Deseja fazer outra conversão? (s/n)");
        String resposta = entrada.nextLine();
        if (!resposta.equalsIgnoreCase("s")) {
            break;
        }

        }
        }

}





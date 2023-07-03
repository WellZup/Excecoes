package ConversorDeMoedas;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversorDeMoeda conversor = new ConversorDeMoeda(new BigDecimal("5.43"), new BigDecimal("4.21"), new BigDecimal("6.22"), new BigDecimal("7.34"));

        while (true) {
            System.out.println("Boas vindas ao conversor de moedas");
            System.out.println("Qual a moeda que você quer converter?");
            System.out.println("1. Dólar americano");
            System.out.println("2. Dólar canadense");
            System.out.println("3. Euro");
            System.out.println("4. Libra Esterlina");
            String moeda = scanner.nextLine();

            try {
                System.out.println("O programa só sabe converter dinheiro para Real (R$)");
                System.out.println("Digite o valor a ser convertido:");
                String valorStr = scanner.nextLine();
                BigDecimal valor = new BigDecimal(valorStr);

                if (valor.compareTo(BigDecimal.ZERO) <= 0) {
                    System.out.println("Valor inválido, por favor, tente novamente");
                    continue;
                }

                BigDecimal valorConvertido = conversor.converterParaReal(moeda, valor);
                System.out.printf("O valor que pediu para converter de %s em reais é R$%.2f%n", valor, valorConvertido);
            } catch (NumberFormatException erro) {
                System.out.println("Para moeda, o valor monetário deve ser um número decimal");
            } catch (IllegalArgumentException erro) {
                System.out.println(erro.getMessage());
            }

            System.out.println("Deseja fazer outra conversão? (s/n)");
            String resposta = scanner.nextLine();
            if (!resposta.equalsIgnoreCase("s")) {
                break;
            }
        }
    }
}

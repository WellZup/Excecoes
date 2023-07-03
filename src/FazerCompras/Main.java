package FazerCompras;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ListaCompras listaCompras = new ListaCompras();

        boolean encerrar = false;
        while (!encerrar) {
            System.out.println("===== Menu =====");
            System.out.println("1. Adicionar alimento à lista de compras");
            System.out.println("2. Exibir lista de compras");
            System.out.println("3. Exibir quantidade por tipo de alimento");
            System.out.println("4. Encerrar o processo");
            System.out.println("Escolha uma opção: ");

            int opcao = Integer.parseInt(entrada.nextLine());

            switch (opcao) {
                case 1:
                    adicionarAlimento(entrada, listaCompras);
                    break;
                case 2:
                    listaCompras.exibirListaCompras();
                    break;

                case 3:
                    listaCompras.exibirQuantidadePorTipo();
                    break;
                case 4:
                    encerrar = true;
                    break;
                default:
                    System.out.println("Opção invalida.");
            }
        }
    }

    private static void adicionarAlimento(Scanner entrada, ListaCompras listaCompras) {
        System.out.println("Digite o tipo de alimento (VERDURA, LEGUME, GRAOS -sem acento-  ou OUTROS): ");
        String tipo = entrada.nextLine().toLowerCase();

        switch (tipo.toUpperCase()) {
            case "VERDURA":
                adicionarVerdura(entrada, listaCompras);
                break;
            case "LEGUME":
                adicionarLegume(entrada, listaCompras);
                break;
            case "GRAOS":
                adicionarGrao(entrada, listaCompras);
                break;
            case "OUTROS":
                adicionarOutroAlimento(entrada, listaCompras);
                break;
            default:
                System.out.println("Tipo de alimento inválido");
        }
    }

    private static void adicionarVerdura(Scanner entrada, ListaCompras listaCompras) {
        System.out.println("Digite a quantidade em gramas: ");
        String quantidadeStr = entrada.nextLine();

        try {
            double quantidade = Double.parseDouble(quantidadeStr);
            if ((int) quantidade == quantidade) {
                throw new NumberFormatException("Para verdura, a quantidade deve ser informada com ponto.");
            }

            System.out.println("Digite o nome do alimento: ");
            String nome = entrada.nextLine();

            listaCompras.adicionarAlimento(new Verdura(nome, quantidade));
            System.out.println("Alimento adicionada à lista");

        } catch (NumberFormatException e) {
            System.out.println("Formato inválido da quantidade: " + quantidadeStr);
            System.out.println("Para verdura, a quantidade deve ser informada com ponto.");
        }
    }

    private static void adicionarLegume(Scanner entrada, ListaCompras listaCompras) {
        System.out.println("Digite a quantidade em unidades: ");
        String quantidadeStr = entrada.nextLine();

        int quantidade;
        try {
            quantidade = Integer.parseInt(quantidadeStr);
            if (quantidade <= 0) {
                throw new IllegalArgumentException("A quantidade deve ser maior que zero.");
            }

            System.out.println("Digite o nome do alimento: ");
            String nome = entrada.nextLine();

            listaCompras.adicionarAlimento(new Legume(nome, quantidade));
            System.out.println("Alimento adicionada à lista");

        } catch (NumberFormatException e) {
            System.out.println("Formato inválido da quantidade: " + quantidadeStr);
            System.out.println("Para legume, a quantidade deve ser informada em unidades inteiras.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void adicionarGrao(Scanner entrada, ListaCompras listaCompras) {
        System.out.print("Digite a quantidade em gramas: ");
        String quantidadeStr = entrada.nextLine();

        try {
            double quantidade = Double.parseDouble(quantidadeStr);
            if ((int) quantidade == quantidade) {
                throw new NumberFormatException("Para grãos, a quantidade deve ser informada com ponto.");
            }

            System.out.println("Digite o nome do alimento: ");
            String nome = entrada.nextLine();

            listaCompras.adicionarAlimento(new Graos(nome, quantidade));
            System.out.println("Alimento adicionada à lista");

        } catch (NumberFormatException e) {
            System.out.println("Formato inválido da quantidade: " + quantidadeStr);
            System.out.println("Para grãos, a quantidade deve ser informada com ponto.");
        }
    }

    private static void adicionarOutroAlimento(Scanner entrada, ListaCompras listaCompras) {
        System.out.println("Digite a quantidade em unidades: ");
        String quantidadeStr = entrada.nextLine();

        int quantidade;
        try {
            quantidade = Integer.parseInt(quantidadeStr);
            if (quantidade <= 0) {
                throw new IllegalArgumentException("A quantidade deve ser maior que zero.");
            }

            System.out.println("Digite o nome do alimento: ");
            String nome = entrada.nextLine();

            listaCompras.adicionarAlimento(new OutroAlimento(nome, quantidade));
            System.out.println("Alimento adicionada à lista");

        } catch (NumberFormatException e) {
            System.out.println("Formato inválido da quantidade: " + quantidadeStr);
            System.out.println("Para outro alimento, a quantidade deve ser informada em unidades inteiras.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}

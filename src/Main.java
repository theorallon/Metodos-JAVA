import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        clearConsole();

        System.out.println("[ Início do programa ]");
        System.out.println("Primeiro, faça login:");
        Metodos.fazerLogin();

        clearConsole();

        int opcao;
        int numero;
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Verificação número par");
        System.out.println("2 - Verificação número primo");
        System.out.println("3 - Somar");
        System.out.print("Opção: ");
        opcao = Integer.parseInt(keyboard.nextLine());

        switch (opcao) {
            case 1:
                System.out.print("\nDigite um número para verificar par/ímpar: ");
                numero = Integer.parseInt(keyboard.nextLine());
                System.out.println("O número " + numero + (Metodos.ehPar(numero) ? " é par." : " não é par."));
                break;
            case 2:
                System.out.print("\nDigite um número para verificar se é primo: ");
                numero = Integer.parseInt(keyboard.nextLine());
                System.out.println("O número " + numero + (Metodos.ehPrimo(numero) ? " é primo." : " não é primo."));
                break;
            case 3:
                System.out.print("\nDigite o primeiro número para somar: ");
                int a = Integer.parseInt(keyboard.nextLine());
                System.out.print("Digite o segundo número para somar: ");
                int b = Integer.parseInt(keyboard.nextLine());

                int soma = Metodos.somar(a, b);
                System.out.println("Resultado da soma: " + a + " + " + b + " = " + soma);
                break;
            default:
                System.out.println("Opção inválida. Reinicie o programa e escolha 1, 2 ou 3.");
                break;
        }
        keyboard.close();
    }

    public static void clearConsole() {
        System.out.println("\033[H\033[2J");
        if (System.console() != null) {
            System.console().flush();
        }
    }

}

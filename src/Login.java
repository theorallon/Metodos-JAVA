
import java.util.Scanner;

public class Login {

    static Scanner keyboard = new Scanner(System.in);
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final int MAXATTEMPTS = 3;
    public static void main(String[] args) {    
            telaLogin();
    }


    public static void telaLogin() {
        AdminUser adminUser = new AdminUser();
        boolean loginSucesso = false;
        int attempts = 0;

        while (attempts < MAXATTEMPTS && !loginSucesso) {
            System.out.print(YELLOW + "[ ===== Tela de Login ===== ]" + RESET + "\n\n" +  "Digite seu nome de usuário: ");
            String username = keyboard.nextLine();
            System.out.print("Digite sua senha: ");
            String password = keyboard.nextLine();

            if(username.isEmpty() || password.isEmpty()) {
                clearConsole();
                System.out.println(RED + "\n[ Todos os campos precisam ser preenchidos ]" + RESET);
                attempts++;
            } else if(!adminUser.getUsername().equals(username) || !adminUser.getPassword().equals(password)) {
                clearConsole();
                System.out.println(RED + "\n[ Dados não válidos! Tentativas restantes: " + (MAXATTEMPTS - attempts - 1) + " ]" + RESET);
                attempts++;
            } else {
                System.out.println(GREEN + "\n[ Login efetuado com sucesso! ]" + RESET);
                loginSucesso = true;
            }
        }

        if (!loginSucesso) {
            System.out.println(RED + "\n[ Login falhou. Número máximo de tentativas atingido. ]" + RESET);
        }
    }

    public static void clearConsole() {
        System.out.println("\033[H\033[2J");
        if (System.console() != null) {
            System.console().flush();
        }
    }
}
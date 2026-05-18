import java.util.Scanner;

public class TestFazerLogin {
    public static void main(String[] args) {
        System.out.println("=== Teste de Metodos.fazerLogin ===");
        System.out.println("Este teste é interativo. Digite 'Admin' e '12345' quando solicitado.");
        System.out.println("Se o login for bem-sucedido, o método deve mostrar mensagem de sucesso.");
        Metodos.fazerLogin();
        System.out.println("=== Fim do teste de fazerLogin ===");
    }
}

public class Metodos {
    public static void fazerLogin() {
        Login.telaLogin();
    }

    public static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }

    public static boolean ehPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int somar(int a, int b) {
        return a + b;
    }
}

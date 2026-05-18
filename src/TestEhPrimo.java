public class TestEhPrimo {
    public static void main(String[] args) {
        System.out.println("=== Teste de Metodos.ehPrimo ===");
        verificar(1, false);
        verificar(2, true);
        verificar(3, true);
        verificar(4, false);
        verificar(17, true);
        verificar(18, false);
        System.out.println("=== Fim dos testes de ehPrimo ===");
    }

    private static void verificar(int numero, boolean esperado) {
        boolean resultado = Metodos.ehPrimo(numero);
        if (resultado == esperado) {
            System.out.println("OK: " + numero + " => " + resultado);
        } else {
            System.out.println("ERRO: " + numero + " => " + resultado + " (esperado " + esperado + ")");
        }
    }
}

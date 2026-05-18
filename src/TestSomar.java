public class TestSomar {
    public static void main(String[] args) {
        System.out.println("=== Teste de Metodos.somar ===");
        verificar(2, 3, 5);
        verificar(0, 0, 0);
        verificar(-5, 5, 0);
        verificar(-3, -7, -10);
        System.out.println("=== Fim dos testes de somar ===");
    }

    private static void verificar(int a, int b, int esperado) {
        int resultado = Metodos.somar(a, b);
        if (resultado == esperado) {
            System.out.println("OK: " + a + " + " + b + " = " + resultado);
        } else {
            System.out.println("ERRO: " + a + " + " + b + " = " + resultado + " (esperado " + esperado + ")");
        }
    }
}

public class TestEhPar {
    public static void main(String[] args) {
        System.out.println("=== Teste de Metodos.ehPar ===");
        verificar(2, true);
        verificar(3, false);
        verificar(0, true);
        verificar(-4, true);
        System.out.println("=== Fim dos testes de ehPar ===");
    }

    private static void verificar(int numero, boolean esperado) {
        boolean resultado = Metodos.ehPar(numero);
        if (resultado == esperado) {
            System.out.println("OK: " + numero + " => " + resultado);
        } else {
            System.out.println("ERRO: " + numero + " => " + resultado + " (esperado " + esperado + ")");
        }
    }
}

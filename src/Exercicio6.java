public class Exercicio6 {

    public static double bissecao(Function func, double a, double b, double tol) {
        double c;
        while ((b - a) / 2 > tol) {
            c = (a + b) / 2;
            if (func.f(c) == 0.0)
                return c;
            else if (func.f(a) * func.f(c) < 0)
                b = c;
            else
                a = c;
        }
        return (a + b) / 2;
    }

    public static void main(String[] args) {
        double tol = 1e-5;

        // Equação 1: x - 2^x = 0 para 0 ≤ x ≤ 1
        Function f1 = x -> x - Math.pow(2, x);
        System.out.println("Raiz da equação x - 2^x = 0: " + bissecao(f1, 0, 1, tol));

        // Equação 2: e^x - x^2 + 3x - 2 = 0 para 0 ≤ x ≤ 1
        Function f2 = x -> Math.exp(x) - Math.pow(x, 2) + 3 * x - 2;
        System.out.println("Raiz da equação e^x - x^2 + 3x - 2 = 0: " + bissecao(f2, 0, 1, tol));

        // Equação 3: 2xcos(2x) − (x + 1)^2 = 0 para −3 ≤ x ≤ −2 e 1 ≤ x ≤ 0
        Function f3 = x -> 2 * x * Math.cos(2 * x) - Math.pow(x + 1, 2);
        System.out.println("Raiz da equação 2xcos(2x) - (x+1)^2 = 0 no intervalo [-3, -2]: " + bissecao(f3, -3, -2, tol));
        System.out.println("Raiz da equação 2xcos(2x) - (x+1)^2 = 0 no intervalo [1, 0]: " + bissecao(f3, 0, 1, tol));
    }
}

@FunctionalInterface
interface Function {
    double f(double x);
}

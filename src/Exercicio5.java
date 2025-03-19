public class Exercicio5 {

    // Função f(x) = x^3 - 7x^2 + 14x - 6
    public static double f(double x) {
        return Math.pow(x, 3) - 7 * Math.pow(x, 2) + 14 * x - 6;
    }

    // Método da bisseção
    public static double bisection(double a, double b, double tolerance) {
        double mid = 0;

        if (f(a) * f(b) >= 0) {
            System.out.println("O intervalo não contém uma raiz válida.");
            return Double.NaN;
        }

        while ((b - a) / 2 > tolerance) {
            mid = (a + b) / 2;
            if (f(mid) == 0.0) {
                break;
            } else if (f(a) * f(mid) < 0) {
                b = mid;
            } else {
                a = mid;
            }
        }
        return mid;
    }

    public static void main(String[] args) {
        double tolerance = 0.01;

        double root1 = bisection(0, 1, tolerance);
        System.out.println("Raiz no intervalo [0,1]: " + root1);

        double root2 = bisection(1, 3.2, tolerance);
        System.out.println("Raiz no intervalo [1,3.2]: " + root2);

        double root3 = bisection(3.2, 4, tolerance);
        System.out.println("Raiz no intervalo [3.2,4]: " + root3);
    }
}

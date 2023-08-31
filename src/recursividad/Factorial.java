package recursividad;

public class Factorial {

    // realizar un algortmo recursivo que calcule el factorial de un numero
    // 5! = 5x4x3x2x1 = 1x2x3x4x5
    public static int Factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * Factorial(n - 1);
        }

    }
    public static void main(String[] args) {
        System.out.println(Factorial(5));
    }

}

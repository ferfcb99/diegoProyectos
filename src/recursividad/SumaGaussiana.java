package recursividad;

public class SumaGaussiana {
    // suma gaussiana: suma los numeros de 1 a N para todo N real.
    // 100 

    public int sumaGaussiana(int numero) { // 5

        int suma = 0;
        for (int i = 1; i <= numero; i++) { // 1<=5 2<=5 3<=5 4<=5 5<=5 6<=5
            suma += i; // 0+1=1 - 1+2=3 - 3+3 = 6 - 6+4=10 - 10+5=15
        }
        return suma; // 
    }

    public int sumaGaussianaRecursiva(int numero) { // 5 4 3 2 1 0
        if (numero == 0) {
            return 0;
        } else {
            return numero + sumaGaussianaRecursiva(numero - 1); // 5 + 4 + 3 + 2 + 1 + 0
        }
    }

    // hacer un algoritmo que calcule la suma de todos los numeros entre N y M   [5 - 10] 
    public int entreNyM(int a, int b) {
        int suma = 0;
        if (b < a) {
            System.out.println("'a' debe ser mayor a 'b'");
            return 0;
        }
        while (a < b) {
            suma = suma + a;
            a++;
            System.out.print(a + ", ");
        }

        return suma;
    }

    public static int sumaEntreNym(int n, int m) {
        if (n > m) {
            return 0;
        } else {
            return n + sumaEntreNym(n + 1, m);
        }
    }

    public static void main(String[] args) {
        SumaGaussiana sumaGaussiana = new SumaGaussiana();

        // System.out.println(sumaGaussiana.sumaGaussiana(100));
        //System.out.println(sumaGaussiana.sumaGaussianaRecursiva(100));
        System.out.println(sumaGaussiana.sumaGaussianaRecursiva(100));
    }

}

package recursividad;

public class RaizDigital {

    // raiz digital es la suma recursiva de los digitos de un numero
    // hasta llegar a una suma con un solo digito
    // 87 -> 8+7 -> 15 -> 1+5 = 6
    public static int raizDigital(int numero) {
        if (numero < 10) {
            return numero;
        } else {
            int sumaDigitos = sumaDeDigitos(numero);
            return raizDigital(sumaDigitos);
        }
    }

    private static int sumaDeDigitos(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero % 10 + sumaDeDigitos(numero / 10);
        }
    }
    public static void main(String[] args) {
        System.out.println(raizDigital(81));
    }
           
}

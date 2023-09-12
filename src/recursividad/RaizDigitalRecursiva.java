package recursividad;

public class RaizDigitalRecursiva {

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

    // funcion que muestra las raices en un intervalo [x, y]
    public void muestraRaices(int inicio, int fin) {
        for (int i = inicio; i < fin; i++) {
            System.out.println(i + " - " + raizDigital(i));
        }
    }

    public int cuentaRaicesXEnIntervalo(int raizAContar, int inicio, int fin) { // cuentaRaicesXEnIntervalo(2, 10, 100) = 10
                                                                                // cuentaRaicesXEnIntervalo(3, 10, 100) = 10
        int cuentaRaices = 0;
        for (int i = inicio; i < fin; i++) {
            if (raizDigital(i) == raizAContar) {
                cuentaRaices = cuentaRaices + 1;
            }
        }
        return cuentaRaices;
    }
    
    public boolean hayIgualCantidadDeRaicesEnIntervalo(int inicio, int fin){    // hayIgualCantidadDeRaicesEnIntervalo(10, 100) : true, si hay igual cantidad 1-9
        boolean existenIgualCantidad = true;
        int totalRaices = cuentaRaicesXEnIntervalo(1, inicio, fin); // 10
        for (int i = 2; i < 10; i++) { // 2,3,4,5,6,7,8,9
            int raicesTemporales  = cuentaRaicesXEnIntervalo(i, inicio, fin); // 10 10 10 10 10
            if(totalRaices != raicesTemporales){
                existenIgualCantidad = false;
                break;
            }
        }
        return existenIgualCantidad;
    }
    
    public void muestraSolucion(int cantidadDeIntervalos){ // 3 -> 1, 10 | 10, 100 | 100, 1000
        int inicioIntervalo = 1;
        int finIntevalo = 10;
        boolean hayIgualCantidad = false;
        for (int i = cantidadDeIntervalos; i > 0; i--) {
            hayIgualCantidad = hayIgualCantidadDeRaicesEnIntervalo(inicioIntervalo, finIntevalo); // 1, 10
            if(hayIgualCantidad == true){
                System.out.println("En el intervalo [" + inicioIntervalo + ", " + (finIntevalo - 1) + "] hay igual cantidad de raices");
            }else{
                System.out.println("En el intervalo [" + inicioIntervalo + ", " + (finIntevalo - 1) + "] NO hay igual cantidad de raices");
            }
            inicioIntervalo = inicioIntervalo * 10;
            finIntevalo = finIntevalo * 10;
        }
    }

    public static void main(String[] args) {

        RaizDigitalRecursiva raiz = new RaizDigitalRecursiva();
        // System.out.println(raizDigital(123456)); // 21 -> 3
        // raiz.muestraRaices(100, 1000);
       /* System.out.println("Raiz 5");
        System.out.println(raiz.cuentaRaicesXEnIntervalo(5, 10, 100));
        System.out.println("Raiz 7");
        System.out.println(raiz.cuentaRaicesXEnIntervalo(7, 10, 100));
        System.out.println("Raiz 3");
        System.out.println(raiz.cuentaRaicesXEnIntervalo(3, 10, 100));
    */
       
        //System.out.println(raiz.hayIgualCantidadDeRaicesEnIntervalo(10, 100));
        raiz.muestraSolucion(8);
    }

}

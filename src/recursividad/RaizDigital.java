package recursividad;

public class RaizDigital {

    // raiz digital es la suma recursiva de los digitos de un numero
    // hasta llegar a una suma con un solo digito
    // 87 -> 8+7 -> 15 -> 1+5 = 6
<<<<<<< HEAD
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
           
=======
    
    public int sumaDigitos(int numero){ // 1525 23456789
        int suma = 0;
        while(numero != 0){ // 1525 - 152
            suma = suma + (numero % 10); // 0 + 5 = 5 ----- 5 + 2 = 7 -----
            numero = numero / 10; // 152 15
        }
        return suma;
    }
    
    public int calculaRaizDigital(int numero){ // 17 99
        int raiz = sumaDigitos(numero); // 8 18
        while(raiz > 9){
            raiz = sumaDigitos(raiz); // 9
        }
        return raiz;
    }
    
    
    /* hacer recursivo
        public int sumaDigitos(int numero){ // 1525 23456789
        int suma = 0;
        while(numero != 0){ // 1525 - 152
            suma = suma + (numero % 10); // 0 + 5 = 5 ----- 5 + 2 = 7 -----
            numero = numero / 10; // 152 15
        }
        return suma;
    }
    */
    
    
    public static void main(String[] args) {
        RaizDigital raizDigital = new RaizDigital();
        System.out.println(raizDigital.sumaDigitos(1525));
        
        System.out.println(raizDigital.calculaRaizDigital(1525));
    }
    

    
    
>>>>>>> 07b65774f76a5c4b4eb30ff0ed29b552e0d01567
}

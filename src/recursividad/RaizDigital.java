
package recursividad;

public class RaizDigital {
    
    // raiz digital es la suma recursiva de los digitos de un numero
    // hasta llegar a una suma con un solo digito
    // 87 -> 8+7 -> 15 -> 1+5 = 6
    
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
    

    
    
}

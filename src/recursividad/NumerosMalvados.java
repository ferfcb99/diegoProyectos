
package recursividad;

public class NumerosMalvados {
    
    public static void main(String[] args) {
        NumerosMalvados nm = new NumerosMalvados();
        System.out.println(nm.convierteABinario(13)); // 1101
        System.out.println(nm.convierteABinario(15)); // 1111
    }
    
    // funcion convierta un numero a binario -> convierteABinario(5) -> 101
    
    public long convierteABinario(int numero){ // 13
    
        long numeroBinario = 0;
        int potenciaRelativa = 0;
        
        while(numero != 0){ // 13 6 3 1 0
            numeroBinario = numeroBinario + (numero % 2) * (long)(Math.pow(10, potenciaRelativa)); // 0 = 0 + 1 * 10^0 = 1 
                                                                                                       // 1 = 1 + 0 * 10^1 = 1
                                                                                                       // 1 = 1 + 1 * 10^2 = 101
                                                                                                       // 101 = 101 + 1 * 10^3 = 1101
            numero = numero / 2; // 6 3 1 0
            potenciaRelativa = potenciaRelativa + 1; // 1 2 3 4
        }
        return numeroBinario;
    }
    
    
    // funcion que cuente cuantos digitos k hay en un numero m -> cantidadDigitosEnNumero(21522, 2) -> 3
    // binario [1,2]
    // octal [0,1,2,3,4,5,6,7]
    // hexadecimal [0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F] 
    
    
    
    
}

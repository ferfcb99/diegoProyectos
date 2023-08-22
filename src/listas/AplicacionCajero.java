
package listas;

import java.util.Scanner;

public class AplicacionCajero {
    
    public int consultaMenu(){
        
        Scanner scanner = new Scanner(System.in);
        int opcionSeleccionada;
        System.out.println("1. Registrar cliente. ");
        System.out.println("2. Consultar informacion de cliente. ");
        System.out.println("3. Depositar. ");
        System.out.println("4. Retirar. ");
        System.out.println("5. Salir. ");
        
        opcionSeleccionada = scanner.nextInt();
        return opcionSeleccionada;
    }
    
    public static void main(String[] args) {
        AplicacionCajero aplicacionCajero = new AplicacionCajero();
        System.out.println(aplicacionCajero.consultaMenu());
    }
    
    
    
    
}

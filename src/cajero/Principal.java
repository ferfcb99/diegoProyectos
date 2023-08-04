package cajero;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        Operaciones comunicador = new Operaciones(10000,
                "Diego", "Jimenez", "12342536472826623", "456", "20230712"
        );
        /* 
        System.out.println(comunicador.getNombre());
    System.out.println("Nombre del titular: " + comunicador.getNombre());
    System.out.println("Monto total antes de agregar: " + comunicador.getMontoTotal());
    comunicador.agregueMonto(500);
    System.out.println("Monto total después de agregar 500: " + comunicador.getMontoTotal());
    comunicador.quitaMonto(5000);
        System.out.println(comunicador.getMontoTotal());
         */
        while (opcion != 0) {
            System.out.println("------MENU-----");
            System.out.println("1. Consulta de datos");
            System.out.println("2. Modificacion de datos");
            System.out.println("3. Deposito");
            System.out.println("4. Retiro");
            System.out.println("0. Salir");

            System.out.println("Opcion a elegir: ");
            opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.println("----------MOSTRANDO DATOS-----------");
                comunicador.muestraDatos();
            } else if (opcion == 2) {
                comunicador.modificaDatos();

            } else if (opcion == 3) {
                comunicador.deposito();

            } else if (opcion == 4) {
                comunicador.retiro();

            } else if (opcion == 0) {
                break;
            } else {
                System.out.println("Debes elegir una de las opciones del menu mostrado");
                continue;
            }

        }

    }
}

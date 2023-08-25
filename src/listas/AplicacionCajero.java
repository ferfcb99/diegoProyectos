package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AplicacionCajero {

    int id_cliente = 3;

    public int consultaMenu() {

        Scanner scanner = new Scanner(System.in);
        int opcionSeleccionada;
        System.out.println("0. Mostrar registros. ");
        System.out.println("1. Registrar cliente. ");
        System.out.println("2. Consultar informacion de cliente. ");
        System.out.println("3. Depositar. ");
        System.out.println("4. Retirar. ");
        System.out.println("5. Salir. ");

        opcionSeleccionada = scanner.nextInt();
        return opcionSeleccionada;
    }

    public Cliente registraCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el nombre: ");
        String nombre_cliente = scanner.nextLine();

        System.out.println("Ingresa el apellido: ");
        String apellido_cliente = scanner.nextLine();

        System.out.println("Ingresa la cuenta: ");
        String cuenta_cliente = scanner.nextLine();

        System.out.println("Ingresa el saldo: ");
        double saldo_cliente = scanner.nextDouble();

        Cliente cliente = new Cliente(this.id_cliente + 1, nombre_cliente, apellido_cliente, cuenta_cliente, saldo_cliente);

        this.id_cliente = this.id_cliente + 1;

        return cliente;
    }

    public void mostrarClientes(List<Cliente> clientes) {
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getId_cliente() + " - " + cliente.getNombre_cliente() + " - "
                    + cliente.getApellido_cliente());
        }
    }

    public void mostrarClientesPorId(List<Cliente> clientes) {
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getId_cliente() + " - " + cliente.getNombre_cliente() + " - "
                    + cliente.getApellido_cliente());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el id del cliente a mostrar: ");
        int id_cliente_operar = scanner.nextInt();

        Cliente cliente = clientes.get(id_cliente_operar - 1);

        System.out.println(cliente.getId_cliente() + " - " + cliente.getNombre_cliente() + " - "
                + cliente.getApellido_cliente() + " - " + cliente.getCuenta_cliente() + " - " + cliente.getSaldo_cliente());

    }

    // crear una funcion que reciba una lista de clientes, muestre los clienets existentes, pregunte por el id a modificar
    public List<Cliente> realizaDeposito(List<Cliente> clientes) {
        mostrarClientes(clientes);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el id del cliente a depositar: ");
        int id_cliente_operar = scanner.nextInt();

        Cliente cliente = clientes.get(id_cliente_operar - 1);
        cliente.deposito();

        clientes.set(id_cliente_operar - 1, cliente);

        return clientes;
    }
    
    // crear funcion de retiro

    public static void main(String[] args) {
        AplicacionCajero aplicacionCajero = new AplicacionCajero();

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente(1, "Fernando", "Munguia", "456789", 500000));
        clientes.add(new Cliente(2, "Paola", "Martinez", "65432", 500000));
        clientes.add(new Cliente(3, "Joselin", "Perez", "76543", 500000));

        int opcionSeleccionada = 0;

        while (opcionSeleccionada != 5) {
            opcionSeleccionada = aplicacionCajero.consultaMenu();

            switch (opcionSeleccionada) {

                case 0:
                    aplicacionCajero.mostrarClientes(clientes);
                    break;

                case 1:
                    Cliente cliente = aplicacionCajero.registraCliente();
                    clientes.add(cliente);
                    break;
                case 2:
                    aplicacionCajero.mostrarClientesPorId(clientes);
                    break;
                case 3:
                    aplicacionCajero.realizaDeposito(clientes);
                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    throw new AssertionError();
            }

        }

    }

}

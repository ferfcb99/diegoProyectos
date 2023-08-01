package cajero;

import java.util.Scanner;

public class Operaciones {

    public Operaciones() {
        System.out.println("Ejecutando constructor");
    }

    public Operaciones(int montoTotal, String nombre, String apellido, String noCuenta, String nip, String fechaVigencia) {
        this.montoTotal = montoTotal;
        this.nombre = nombre;
        this.apellido = apellido;
        this.noCuenta = noCuenta;
        this.nip = nip;
        this.fechaVigencia = fechaVigencia;
    }

    // retiro - tranferencia - cargo
    // deposito - abono
    // cambio de informacion 
    // consulta
    public int montoTotal = 0;
    public String nombre = "";
    public String apellido = "";
    public String noCuenta = "";
    public String nip = "";
    public String fechaVigencia = "";
    Scanner scanner;

    // getters : obtener y setters : colocar
    public int getMontoTotal() {
        return this.montoTotal;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public String getNoCuenta() {
        return this.noCuenta;
    }

    public String getNip() {
        return this.nip;
    }

    public String getFechaVigente() {
        return this.fechaVigencia;
    }

    public void setMontoTotal(int montoTotal) {
        this.montoTotal = montoTotal;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNoCuenta(String noCuenta) {
        this.noCuenta = noCuenta;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setFechaVigente(String fechaVigencia) {
        this.fechaVigencia = fechaVigencia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaVigencia(String fechaVigencia) {
        this.fechaVigencia = fechaVigencia;
    }

    public String getFechaVigencia() {
        return fechaVigencia;
    }

    @Override
    public String toString() {
        return "Operaciones{" + "montoTotal=" + montoTotal + ", nombre=" + nombre + ", apellido=" + apellido + ", noCuenta=" + noCuenta + ", nip=" + nip + ", fechaVigencia=" + fechaVigencia + '}';
    }

    // crear una funcion que agregue al montoTotal una cantidad con el nombre de cantidad
    public void agregueMonto(int cantidad) {
        this.montoTotal += cantidad;
    }

    // crear una funcion que quite al monto total una cantidada con el nomrbe de cantidad
    public void quitaMonto(int cantidad) {
        this.montoTotal -= cantidad;
    }

    public void muestraDatos() {
        System.out.println(this.toString());
    }

    public void modificaDatos() {
        String nombre = "";
        String apellido = "";
        String nip = "";
        scanner = new Scanner(System.in);
        System.out.println("Ingresa el nuevo nombre: ");
        nombre = scanner.nextLine();
        System.out.println("Ingresa el nuevo apellido: ");
        apellido = scanner.nextLine();
        System.out.println("Ingresa el nuevo nip: ");
        nip = scanner.nextLine();

        if (!(nombre.equals("") && apellido.equals("") && nip.equals(""))) {
            this.setNombre(nombre);
            this.setApellido(apellido);
            this.setNip(nip);
            System.out.println("Datos modificados exitosamente!!");
        } else {
            System.out.println("Ingreso datos nulos, regresando al menu...");
        }
    }

    public void deposito() {
        scanner = new Scanner(System.in);
        System.out.println("Cantidad a depositar: ");
        int monto = scanner.nextInt();
        this.agregueMonto(monto);
    }

}

package listas;

import java.util.Scanner;

public class Cliente {
    
    private int id_cliente; // null
    private String nombre_cliente; // ""
    private String apellido_cliente;
    private String cuenta_cliente;
    private double saldo_cliente; // 0.0
    
    public Cliente(int id_cliente,String nombre_cliente, String apellido_cliente, String cuenta_cliente, double saldo_cliente){
       this.id_cliente = id_cliente; 
       this.nombre_cliente = nombre_cliente;
       this.apellido_cliente = apellido_cliente;
       this.cuenta_cliente = cuenta_cliente;
       this.saldo_cliente = saldo_cliente;
    }
    
    public Cliente(){
    
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getApellido_cliente() {
        return apellido_cliente;
    }

    public void setApellido_cliente(String apellido_cliente) {
        this.apellido_cliente = apellido_cliente;
    }

    public String getCuenta_cliente() {
        return cuenta_cliente;
    }

    public void setCuenta_cliente(String cuenta_cliente) {
        this.cuenta_cliente = cuenta_cliente;
    }

    public double getSaldo_cliente() {
        return saldo_cliente;
    }

    public void setSaldo_cliente(double saldo_cliente) {
        this.saldo_cliente = saldo_cliente;
    }
    
    public void deposito(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cantidad a depositar:¨");
        double montoDepositar = scanner.nextDouble();
        this.saldo_cliente = getSaldo_cliente() + montoDepositar;
    }
    
    // realizar una funcion que realize el retiro del cliente
    public void retiro(){
     Scanner scanner = new Scanner(System.in);
        System.out.print("Cantidad a retirar:¨"); 
        int monto = scanner.nextInt();
        if(monto > saldo_cliente){
            System.out.println("No tienes esta cantidad");
        }else{
            this.saldo_cliente= getSaldo_cliente() - monto;
        }
    }
    
    
    
    
    
}

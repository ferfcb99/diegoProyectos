package cajero;

public class Operaciones {
    
    public Operaciones(){
        System.out.println("Ejecutando constructor");
    }
    
    public Operaciones(int montoTotal, String nombre, String apellido, String noCuenta, String nip, String fechaVigencia){
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
    
    // crear una funcion que agregue al montoTotal una cantidad con el nombre de cantidad
    
   public void agregueMonto(int cantidad){
    this.montoTotal +=cantidad;
   }
    // crear una funcion que quite al monto total una cantidada con el nomrbe de cantidad
   public void quitaMonto(int cantidad){
       this.montoTotal -= cantidad;
   }

}

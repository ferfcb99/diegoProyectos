package sintaxisjava;


public class Persona {
    
    
    public void muestraNombre(String nombre){
        System.out.println("Mi nombre es: " + nombre);
    }
    
    public static void main(String[] args) {
        
        Persona comunicador = new Persona();
        comunicador.muestraNombre("Diego");
        
    }
    
}

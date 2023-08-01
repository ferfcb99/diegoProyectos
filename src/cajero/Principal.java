
package cajero;

public class Principal {
    public static void main(String[] args) {
        Operaciones comunicador = new Operaciones(10000,
                "Diego", "Jimenez", "12342536472826623", "456","20230712"
        );
        
        System.out.println(comunicador.getNombre());
 System.out.println("Nombre del titular: " + comunicador.getNombre());
    System.out.println("Monto total antes de agregar: " + comunicador.getMontoTotal());
    comunicador.agregueMonto(500);
    System.out.println("Monto total después de agregar 500: " + comunicador.getMontoTotal());
      
        
    }
}

package cajero;

public class Principal {
    public static void main(String[] args) {
        Operaciones comunicador = new Operaciones(10000,
                "Diego", "Jimenez", "12342536472826623", "456","20230712"
        );
        
        System.out.println(comunicador.getNombre());
        
    }
}

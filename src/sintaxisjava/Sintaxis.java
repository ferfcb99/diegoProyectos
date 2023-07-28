package sintaxisjava;

public class Sintaxis {
    
    
    public static int suma(int a, int b){ // 5, 5
        return a+b; // 10
    }
    
    public static void resta(int a, int b){
        System.out.println(a-b);
    }
    
    public static void main(String[] args) {
        System.out.println(suma(5, 5));
        
        resta(30, 10);
    }
    
}

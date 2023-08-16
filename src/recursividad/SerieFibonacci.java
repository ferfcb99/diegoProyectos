package recursividad;

public class SerieFibonacci {
    // 0, 1, 1, 2, 3, 5, 8....
    
    // funcion que calcule los primeros N numeros de fibonacci
    // serieFibonacci(10) -> 0,1,1,2,3,5,8,13,21,34
    
    public void serieFibonacci(int numero){ // 5
        
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        while((numero-2) > 0){
            int aux = b;
            b = a + b;
            a = aux;
            System.out.print(b + " ");
            numero--;
        }
        
    }
    
    public int serieFibonacciRecursiva(int a, int b, int cantidad){
        if(cantidad == 0){
            return 0;
        }else{
            int aux = b;
            b = a + b;
            a = aux;
            System.out.print(b + " ");
            return serieFibonacciRecursiva(a, b, cantidad - 1);
        }
    }
    
    public static void main(String[] args) {
        SerieFibonacci serieFibonacci = new SerieFibonacci();
        
        serieFibonacci.serieFibonacci(10);
        System.out.println("");
        System.out.println(serieFibonacci.serieFibonacciRecursiva(0, 1, 10));
    }
    
}

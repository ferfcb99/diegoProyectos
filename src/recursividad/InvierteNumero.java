package recursividad;

public class InvierteNumero {
    
    
    public int invierte(int numero){ // 5152 -> 2515
        int numeroInvertido = 0;
        while(numero != 0){
            numeroInvertido = numeroInvertido * 10 + (numero % 10);
            numero = numero / 10;
        }
        return numeroInvertido;
    }
    
    
    public static void main(String[] args) {
            InvierteNumero invierteNumero = new InvierteNumero();
            System.out.println(invierteNumero.invierte(5152456));
            
    }
    
}

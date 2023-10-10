package ejercicios;

public class CaracterPerdido {
    
    public static void main(String[] args) {
        
        String pergamino = "esto es otra limnea t \n esto es otrpa linea t \n esto es otra linea t";
        CaracterPerdido caracterPerdido = new CaracterPerdido();
        System.out.println(caracterPerdido.pergaminoEnUnaLinea(pergamino));
                
        
    }
    
    public String pergaminoEnUnaLinea(String pergamino){
        String[] lineasDePergamino = pergamino.split("\n");
        String pergaminoEnLinea = "";
        for (int i = 0; i < lineasDePergamino.length; i++) {
                pergaminoEnLinea = pergaminoEnLinea + lineasDePergamino[i];
        }
        return pergaminoEnLinea;
    }
    
    
}

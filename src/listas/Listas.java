package listas;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        
        List<String> nombres = new ArrayList<>(); // ["Paola", "Fernando"]
        List<String> nombresSinA = new ArrayList<>();
        
        
        nombres.add("Paola"); // true
        nombres.add("Fernando"); // true
        nombres.add("francisco"); // true
        nombres.add("Joseline"); // false
        nombres.add("Elias"); // true
        nombres.add("Diego"); // false
        nombres.add("Dolores"); // false
        
        //System.out.println(nombres);
        
        for(String nombre : nombres){ // forLoop for(TipoDeDatoDeLaEstructura nombreVariable : estruruaAIterar){}
            if(nombre.contains("a") == false){
                 System.out.println(nombre);
                 nombresSinA.add(nombre);
            }
        }
        System.out.println(nombresSinA);
    }
    
    public boolean iniciaConLaLetra(String inicial, String cadena){ // iniciaConLaLetra("M", "Gerardo"); == false
    
        return true;
    }
}

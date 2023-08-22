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
        System.out.println();
        
        //System.out.println(nombres);
        
        for(String nombre : nombres){ // forLoop for(TipoDeDatoDeLaEstructura nombreVariable : estruruaAIterar){}
            if(nombre.contains("a") == false){
                 System.out.println(nombre);
                 nombresSinA.add(nombre);
            }
        }
        System.out.println(nombresSinA);
        
        System.out.println("-----------------");
        
        System.out.println(iniciaConLaLetra("G", "Gerardo"));
        System.out.println(iniciaConLaLetra("D", "Diego"));
        System.out.println(iniciaConLaLetra("K", "Paola"));
        System.out.println(iniciaConLaLetra("E", "Eduardo"));
        
        
        
    }
    
    public static boolean iniciaConLaLetra(String inicial, String cadena){ // iniciaConLaLetra("M", "Gerardo"); == false       
        /*
        if (cadena.contains(inicial)) {
            return true;
        }else
          return  false;
        */
        // "Fernando".substring(0,1)
        String inicialDeLaCadena = cadena.substring(0, 1);
        // System.out.println("Inicial de la cadena " + inicialDeLaCadena);
        if(inicial.equals(inicialDeLaCadena)){
            return true;
        }
        return false;
    }
}

package mapas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Mapa {

    public static void main(String[] args) {

        HashMap<Integer, String> paises = new HashMap<>();

        paises.put(1, "Mexico");
        paises.put(2, "EE.UU.");
        paises.put(3, "Canada");
        paises.put(4, "Rumania");
        paises.put(5, "Brasil");
        paises.put(6, "Colombia");
        paises.put(7, "Luxemburgo");
        paises.put(8, "Croacia");

        System.out.println(paises.size());

        for (Integer idPais : paises.keySet()) {
            System.out.println("identificador: " + idPais + ", valor: " + paises.get(idPais));
        }

        // hacer un algoritmo que imprima solamente los elementos del mapa con numero par
        // y que los caracteres del valor sean mayores que 6 en cantidad
        System.out.println("-----------------");
        for (Integer idPais : paises.keySet()) {
            if (idPais % 2 == 0 && paises.get(idPais).length() > 6) {
                System.out.println("identificador: " + idPais + ", valor: " + paises.get(idPais));
            }
        }

        /*Set<String> nombres = new HashSet<>();
        
        nombres.add("Fernando");
        nombres.add("Fernando");
        
        for(String nombre : nombres){
            System.out.println(nombre);
        }
        
        System.out.println(nombres.size());
         */
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas;

/**
 *
 * @author Fernando
 */
public class Pruebas {
    
     public static boolean validaCadenaNullOrEmpty(String cadena) {
        if (cadena != null && !cadena.equals("")) {
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        String nombre = "Paola";
        System.out.println(validaCadenaNullOrEmpty(nombre));
    }
}

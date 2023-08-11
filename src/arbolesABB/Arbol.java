package arbolesABB;

public class Arbol {
    
    private Nodo raiz;
    
    public Arbol(){
    
    }
   
    //      3 
    //   4     7
    // x   x  
    
    public void insertar(int valor){ // 6 // 4
        if(this.raiz == null){
            this.raiz = new Nodo(valor);
        }else{
            insertarHijo(this.raiz, valor);
        }
    }
    
    public void insertarHijo(Nodo raiz, int valor){ // 6, 4
        if(valor <= raiz.getValor()){ // 4 < 6 
            if(raiz.getIzquierda() == null){
                raiz.setIzquierda(new Nodo(valor));
            }else{
                insertarHijo(raiz.getIzquierda(), valor);
            }
        }else{ // valor > raiz.getValor()
            if(raiz.getDerecha() == null){
                raiz.setDerecha(new Nodo(valor));
            }else{
                insertarHijo(raiz.getDerecha(), valor);
            }
        }
    }
    
    public void recorridoPreOrden(Nodo raiz){ // raiz, izquierda, derecha
        if(raiz != null){
            raiz.imprimeValor();
            recorridoPreOrden(raiz.getIzquierda());
            recorridoPreOrden(raiz.getDerecha());
        }
    }
    
    public void recorridoInOrden(Nodo raiz){// I-R-D  3
        if(raiz != null){
            recorridoInOrden(raiz.getIzquierda()); // 3 
            raiz.imprimeValor();
            recorridoInOrden(raiz.getDerecha());
        }
    }
    
    
    public void recorridoPostOrden(Nodo raiz){ // I-D-R
        if(raiz != null){
            recorridoPostOrden(raiz.getIzquierda());
            recorridoPostOrden(raiz.getDerecha());
            raiz.imprimeValor();
        }
    }
    
    // realizar la funcion que genera el recorrido orden (izquierda - raiz - derecha)
    
    public static void main(String[] args) {
     
        Arbol objetoArbol = new Arbol();
        objetoArbol.insertar(7);
        objetoArbol.insertar(5);
        objetoArbol.insertar(9);
        objetoArbol.insertar(3);
        objetoArbol.insertar(6);
        objetoArbol.insertar(10);

        
        //            7
        //       5         9
        //    3    6          10
        // recorrido preorden raiz, izquierda, derecha
        // 7 5 3 6 9 10
        // inorden I-R-D
        // 3 5 6 7 9 10
        // postorden I-D-R
        // 3 6 5 10 9 7
        
        System.out.println("Recorrido Pre-Orden");
        objetoArbol.recorridoPreOrden(objetoArbol.raiz);
        System.out.println("");
        System.out.println("Recorrido In-Orden");
        objetoArbol.recorridoInOrden(objetoArbol.raiz);
        System.out.println("");
        System.out.println("Recorrido Post-Orden");
        objetoArbol.recorridoPostOrden(objetoArbol.raiz);
    }
}


package arbolesABB;

public class Arbol {
    
    private Nodo raiz;
    
    public Arbol(){
    
    }
    
    public void insertar(int valor){
        if(this.raiz == null){
            this.raiz = new Nodo(valor);
        }else{
            insertarHijo(this.raiz, valor);
        }
    }
    
    public void insertarHijo(Nodo raiz, int valor){
        if(valor <= raiz.getValor()){
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
    
    // realizar la funcion que genera el recorrido orden (izquierda - raiz - derecha)
    
}


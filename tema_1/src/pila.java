
public class pila {

    final static int MAX = 20;
    private int [] vector;
    private int numElem;

    public pila(){
        numElem = 0;
        vector = new int[MAX];
    }

    public boolean pilaVcia(){
        if(numElem==0){
            return true;
        }
        else{
            return false;
        }
    }

    public void apliar(int dato){
        if(numElem!=MAX){
            vector[numElem] = dato;
            numElem++;
        }
        else{
            System.out.println("La pila esta llena");
        }
    }

    public int desapilar(){
       if(numElem==0){
           System.out.println("La pila esta vacia");
           return 0;
       }
       else{
           numElem--;
           return(vector[numElem]);
       }
    }

    public int cima(){
        if(numElem==0){
            System.out.println("La pila esta vacia");
            return 0;
        }
        else{
            return(vector[numElem-1]);
        }
    }

    public int fondo(){
        if(numElem==0){
            System.out.println("La pila esta vacia");
            return 0;
        }
        else{
            return(vector[0]);
        }
    }


}

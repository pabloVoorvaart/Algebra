import java.util.ArrayList;
import java.util.List;

public class Modulo {
    public int modulo;
    List <Integer> claseResidual = new <Integer> ArrayList();
    List <Integer> inversos = new <Integer> ArrayList();

    public Modulo(int n){

        this.modulo = n;
        for(int i = 1; i<n; i++){
            claseResidual.add(i);
        }


        for ( Integer i : claseResidual){
            AritmeticaEntera obj = new AritmeticaEntera(new ParNumeros(i, n));
            obj.algoritmoEuclides();
            if(obj.obj.getMcd() == 1){
                inversos.add(i);
            }

        }
    }


    public int clase(int n){

        int k = n/modulo;
        int resto = n - k * modulo;
        return resto;
    }

}
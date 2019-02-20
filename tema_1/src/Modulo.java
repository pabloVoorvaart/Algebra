import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    public void claseInversa(){
        for ( Integer i : inversos){
            AritmeticaEntera obj = new AritmeticaEntera(new ParNumeros(i, this.modulo), 1);
            System.out.printf("Para: %d\n", i);
            obj.solGeneral();
        }
    }

    public void ecuacionModular(int a, int c){
            int claseA = clase(a);
            int claseC = clase(c);
            AritmeticaEntera obj = new AritmeticaEntera(new ParNumeros(claseA, this.modulo), claseC);
            obj.solGeneral();

    }

    public int clase(int n){

        int k = n/modulo;
        int resto = n - k * modulo;
        return resto;
    }

}
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Intrduze a: ");
        int a = reader.nextInt();
        System.out.print("\n");

        System.out.print("Intrduze b: ");
        int b = reader.nextInt();
        System.out.print("\n");


        System.out.print("Intrduze c: ");
        int c = reader.nextInt();
        System.out.print("\n");

        AritmeticaEntera medium = new AritmeticaEntera(new ParNumeros(a, b));
        medium.algoritmoEuclidesExtendido();
        //System.out.print(medium.obj.getMcd());

        /*
        Modulo m = new Modulo(a);
        System.out.println(m.inversos);
        System.out.println(m.clase(b));
        */
    }

}
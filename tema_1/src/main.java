import java.util.Scanner;

public class main {

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

        aritmeticaEntera medium = new aritmeticaEntera(new parNumeros(a, b), c);

        medium.solGeneral();
    }

}
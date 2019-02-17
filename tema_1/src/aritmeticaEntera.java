public class aritmeticaEntera {
    private int D, d;
    private int mcd;

    public aritmeticaEntera(int a, int b){
        this.D = a;
        this.d = b;
        mcd = algoritmoEuclides();
    }


    public int getMcd(){
        return mcd;
    }

    public boolean divisible(int a, int b) {
        //Se dice que a divide a b si y solo si existe k perteneciente a Z tal que b = k*a
        int k = 2;
        while (b != a * k) {
            k++;
            if (a * k > b) {
                return false;
            }
        }
        return true;
    }

    public int divisionEuclidea(int a, int b) {
        // Para todo D, d ∈ Z con d != 0 existen dos únicos q, r pertenecientes Z tales que D = q · d + r con 0 < r < |d|
        // D es dividendo, d es divisor, r es resto, q es cociente.

        int Dividendo = a;
        int divisor = b;
        int resto;

        for (int q = 1; q < Dividendo; q++) {
            resto = Dividendo - q * divisor;
            if (Dividendo == q * divisor + resto && resto < divisor) {
                System.out.printf("for D: %d => d: %d, q: %d, r: %d\n", Dividendo, divisor, q, resto);
                return resto;
            }
        }
        return 4342412;
    }


    public int algoritmoEuclides() {
        //Si D, d ∈ Z con d  != 0 y q, r ∈ Z son tales que D = q · d + r  y  0 ≤ r < |d| entonces mcd(D, d) = mcd(d, r).

        int Dividendo = this.D;
        int divisor = this.d;
        int resto;
        while (Dividendo != 0) {
            resto = divisionEuclidea(Dividendo, divisor);
            if(resto==0){
                Dividendo = divisor;
                break;
            }
            else{
                Dividendo = divisor;
                divisor = resto;
            }
        }

        return Dividendo;

    }

    public boolean algoritmoEuclidesExtendido(){
        return false;
    }
}

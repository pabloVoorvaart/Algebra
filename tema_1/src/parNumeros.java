public class parNumeros {
    private int dividendo;
    private int divisor;
    private int cociente;
    private int resto;
    private int mcd;


    public parNumeros(int dividendo, int divisor) {
        this.dividendo = dividendo;
        this.divisor = divisor;
        this.resto = dividendo;
    }

    public int getDividendo() {
        return dividendo;
    }

    public int getDivisor() {
        return divisor;
    }

    public int getCociente() {
        return cociente;
    }

    public int getResto() {
        return resto;
    }

    public int getMcd() {
        return mcd;
    }

    public void setDividendo(int dividendo) {
        System.out.printf("setting dividendo: %d \n", dividendo);
        this.dividendo = dividendo;
    }

    public void setDivisor(int divisor) {
        System.out.printf("setting divisor: %d \n", divisor);
        this.divisor = divisor;
    }

    public void setCociente(int cociente) {
        System.out.printf("setting cociente: %d \n", cociente);

        this.cociente = cociente;
    }

    public void setResto(int resto) {
        System.out.printf("setting resto: %d \n", resto);
        this.resto = resto;
    }

    public void setMcd(int mcd) {
        this.mcd = mcd;
    }
}

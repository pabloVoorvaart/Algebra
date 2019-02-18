public class AritmeticaEntera {
    public ParNumeros obj;
    int x0, y0;
    int a, b, c, d;
    String solX, solY;

    public AritmeticaEntera(ParNumeros obj, int c) {
        this.obj = obj;
        this.a = obj.getDividendo();
        this.b = obj.getDivisor();
        this.c = c;

    }

    public AritmeticaEntera(ParNumeros obj){
        this.obj = obj;
        this.c = 0;
    }

    public boolean divisible(int a, int b) {
        //Se dice que a divide a b si y solo si existe k perteneciente a Z tal que b = k*a

        int k = 1;
        while (b != a * k) {
            k++;
            if (a * k > b) {
                return false;
            }
        }
        this.d = k;
        return true;
    }


    public void divisionEuclidea() {
        // Para todo D, d ∈ Z con d != 0 existen dos únicos q, r pertenecientes Z tales que D = q · d + r con 0 < r < |d|
        // D es dividendo, d es divisor, r es resto, q es cociente.

        for (int q = 1; q < obj.getDividendo(); q++) {
            obj.setResto(obj.getDividendo() - q * obj.getDivisor());
            if (obj.getDividendo() == q * obj.getDivisor() + obj.getResto() && obj.getResto() > 0 && obj.getResto() < obj.getDivisor() || obj.getResto()==0) {
                obj.setCociente(q);
                return;
            }
        }
        System.out.println(obj.getDividendo());

        obj.setResto(obj.getDividendo());
        obj.setCociente(0);
    }


    public void algoritmoEuclides() {
        //Si D, d ∈ Z con d  != 0 y q, r ∈ Z son tales que D = q · d + r  y  0 ≤ r < |d| entonces mcd(D, d) = mcd(d, r).

        this.divisionEuclidea();
        while (obj.getResto() != 0) {
            obj.setDividendo(obj.getDivisor());
            obj.setDivisor(obj.getResto());
            this.divisionEuclidea();
        }
        obj.setMcd(obj.getDivisor());
    }


    public void algoritmoEuclidesExtendido(){
        int xi = 1, xii = 0, x_1;
        int yi = 0, yii = 1, y_1;

        obj.setMcd(obj.getDivisor());
        this.divisionEuclidea();
        while(obj.getResto() != 0){
            x_1 = xii;
            xii = xi - obj.getCociente() * xii;
            xi = x_1;

            y_1 = yii;
            yii = yi - obj.getCociente() * yii;
            yi = y_1;

            obj.setDividendo(obj.getDivisor());
            obj.setDivisor(obj.getResto());
            this.divisionEuclidea();
        }
        this.x0 = xii;
        this.y0 = yii;
        obj.setMcd(obj.getDivisor());
        System.out.printf("x: %d, y: %d , mcd: %d\n", xii, yii, obj.getMcd());
    }

    public void solGeneral(){
        //set mcd(a,b) and x0, y0
        this.algoritmoEuclidesExtendido();
        //check if mcd(a, b) | c
        if(this.divisible(obj.getMcd(), c)) {
            solX = String.format("x = %d + %d*t", x0, b / d);
            solY = String.format("y = %d - %d*t", y0, a / d);
            System.out.println(solX);
            System.out.println(solY);
        }
        else{
            System.out.printf("No hay sol, ya que %d no divide a %d\n", obj.getMcd(), c);
        }
    }
}


public class TrigonometricSeries {
    public static void main(String[] args)
    {
        double  x = Math.PI/3;
        int     numTerms = 10;


        System.out.println("Calculated values:");
        System.out.printf("sin(%1$d) = %2$f \n", (int)Math.round(x*180/Math.PI)
                , sin(x, numTerms));
        System.out.printf("cos(%1$d) = %2$f \n", (int)Math.round(x*180/Math.PI)
                , cos(x, numTerms));

        System.out.println("java.lang.Math values:");
        System.out.printf("sin(%1$d) = %2$f \n", (int)Math.round(x*180/Math.PI)
                , Math.sin(x));
        System.out.printf("cos(%1$d) = %2$f \n", (int)Math.round(x*180/Math.PI)
                , Math.cos(x));
    }



    public static double sin(double x, int numTerms) {
        double sinValue = 0;
        double term = x;
        for (int i = 0; i < numTerms; i++) {
            term = (-1) * x * x / (2*i)*(2*i+1);
            sinValue += term;
        }
        return sinValue;
    }

    public static double cos(double x, int numTerms) {
        double result = 0;
        for (int i = 0; i < numTerms; i++) {
            result += (i%2 == 0 ? 1 : -1) * calculateTerm(x,(2*i+1));
        }
        return result;
    }
}

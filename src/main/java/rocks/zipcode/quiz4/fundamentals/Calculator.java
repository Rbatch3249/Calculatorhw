package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class Calculator {
    public static Double squareRoot(Double value) {
        return Math.sqrt(value);
    }

    public static Double square(Double value) {
        return Math.pow(value,2);
    }

    public static Double[] squareRoots(Double... value) {
        Double[] sqrt = new Double[value.length];
        for(int x = 0; x < value.length; x++){
            sqrt[x] = Math.sqrt(value[x]);
        }
        return sqrt;
    }

    public static Double[] squares(Double... values) {
        Double[] squares = new Double[values.length];
        for(int y = 0; y < values.length; y++){
            squares[y]= Math.pow(values[y],2);
        }
        return squares;

    }

    public static Double add(Double value1, Double value2) {
        double sum = value1 + value2;
        return sum;
    }

    public static Double subtract(Double value1, Double value2) {
        double minus = value1 - value2;
        return minus;
    }


    public static Double divide(Double divisor, Double dividend) {
        double divi = divisor/dividend;
        return divi;
    }
}

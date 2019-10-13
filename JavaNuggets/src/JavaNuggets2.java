import java.math.BigDecimal;

public class JavaNuggets2 {
    private static void showNumbers(){
        double d1 = 0.1; //IEEE Converter shows inaccuracies in translating from binary to double
        double d2 = 0.2;
        double d3 = d1+d2;
        boolean b1 = d3 == 0.3;
        float f1 = 16777217.0f;
        float f2 = f1 + 1.0f;
        float f3 = f1 + 2.0f;
        float f4 = f2 + 1.0f;

        System.out.println(d3);
        System.out.println(b1);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);

        BigDecimal bd1 = new BigDecimal(d1); //Exact presentation of the 0.1 double value
        BigDecimal bd2 = new BigDecimal(d2);
        BigDecimal bd3 = new BigDecimal(d3);
        System.out.println(bd1);
        System.out.println(bd2);
        System.out.println(bd3);
    }
    public static void main(String [] args) {
        showNumbers();
    }
}
/**
 * Referenzdatentyp
 */

public class JavaNuggets4N2 {
    public static void main(String[] args) {
        Zahl z = new Zahl(1);
        increment(z);
        System.out.println("Die Zahl ist " + z.get()); // was wird ausgegeben? -> 2
    }

    public static void increment(Zahl z) {
        z.set(z.get()+1);
    }
}

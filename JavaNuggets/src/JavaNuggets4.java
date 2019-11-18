/**
 * Basisdatentyp
 */

public class JavaNuggets4 {
    public static void main(String[] args) {
        int i = 1;
        increment(i);
        System.out.println("Erste Zahl " + i); // was wird ausgegeben? -> 1 (nur der Variablenwert wird kopiert)

        Integer i2 = 1;
        increment(i2);
        System.out.println("Zweite Zahl " + i2); // was wird ausgegeben? -> 1 (Integer Objekte sind Konstanten)
    }

    public static void increment(int i) {
        i++;
    }

    public static void increment(Integer i) {
        i++;
    }
}

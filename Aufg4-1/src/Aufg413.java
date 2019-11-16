public class Aufg413 {

    private static void fibonacci(int n) {
        long n1 = 0;
        long n2 = 1;
        long n3 = n1 + n2;
        System.out.println("Schritt 0 ist die Zahl " + n1);
        System.out.println("Schritt 1 ist die Zahl " + n2);

        for (int i = 2; i <= n; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println("Schritt " + i + " ist die Zahl " + n3);
        }
    }

    public static void main(String[] args) {
        int n = 93;
        fibonacci(n);
    }
}

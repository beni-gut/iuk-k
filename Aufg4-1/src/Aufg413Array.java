public class Aufg413Array {

    private static int fibonacci(int n) {
        int fib[] = new int[n+1];
        fib[0] = 0;
        fib[1] = 1;
        System.out.println("Schritt 1 ist die Zahl " + fib[0]);
        System.out.println("Schritt 2 ist die Zahl " + fib[1]);
        for (int i = 2; i<n;i++) {
            fib[i] = fib[i - 2] + fib[i - 1];
            System.out.println("Schritt " + (i+1) + " ist die Zahl " + fib[i]);
        }
        return fib[n-1];
    }

    public static void main(String[] args) {
        int n = 8;
        System.out.println("Endzahl ist " + fibonacci(n));
    }
}

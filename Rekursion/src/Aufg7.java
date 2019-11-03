public class Aufg7 {

    /**
     * gibt bei fib(0)=0, bei fib(1)=1 zurück und löst alle höheren n in fib(n-1)+fib(n-2) auf, bis 1 oder 0 zurückgegeben werden
     *
     * */
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * Berechnet die fibonacci reihe bis zur 20sten Stelle
     * */
    public static void main(String[] args) {
        int n=0;
        while (n<=20) {
            int werte = fibonacci(n);
            System.out.println("fib(" + n + "): " + werte);
            n++;
        }
    }

}

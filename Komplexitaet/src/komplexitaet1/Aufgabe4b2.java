package komplexitaet1;

public class Aufgabe4b2 {
    public static void main(String[] args) {
        int k = 1000;
        for (int n = k; n < 1000000000; n = n * 2) {
            int sum = 0;
            long start = System.currentTimeMillis();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    sum++;
                }
            }
            long stop = System.currentTimeMillis();
            long zeit = stop - start;
            System.out.println("n: " + n + " -> t: " + zeit + "ms");
        }
    }
}

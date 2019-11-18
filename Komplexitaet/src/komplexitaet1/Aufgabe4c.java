package komplexitaet1;


public class Aufgabe4c {
    public static void main(String[] args) {
        int n = 10;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }

        double d = .0e15;

        System.out.println(sum);
    }
}

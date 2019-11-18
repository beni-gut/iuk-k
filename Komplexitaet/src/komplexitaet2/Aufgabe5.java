package komplexitaet2;

public class Aufgabe5 {
    static boolean isPrim(int n) {
        int i = 2;
        int j;
        int rest;
        do {
            j = n / i;
            rest = n % i;
            if (rest == 0) {
                return false;
            }
            i++;
        } while (i <= j);
        return true;
    }

    public static void main(String[] args) {
        int n = 3452349;
        System.out.println(isPrim(n));
    }

}

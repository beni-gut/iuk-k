public class Aufg412 {

    private static void fakultaet(int n) {
        int produkt = 1;
        for (int i=1; i<=n; i++) {
            produkt = produkt * i;
            System.out.println("Mal " + i + " gibt " + produkt);
        }
        System.out.println("Die Fakultät von " + n + " ist " + produkt + ".");
    }

    public static void main(String[] args) {
        int n = 12; // 12 ist maximal darstellbare Zahl
        fakultaet(n);
    }
}

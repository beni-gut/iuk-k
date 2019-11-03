public class Test1 {
    /**
     * Die Methode hofstaederZahlen liefert ein Array zurück mit
     * Hofstaeder-Zahlen von 1 bis n.
     *
     * Beispiel: hofstaederZahlen(4) soll ein Array mit den Zahlen
     * { 1, 1, 2, 3 } zurückliefern.
     * Achtung: Da in Java die Arrays üblicherweise mit
     * Startwert 0 indexiert werden, ist im Array die Zahl
     * hofstaeder(3) im Array an der Stelle 2 abgelegt.
     *
     * <code>
     * 	int[] zahlen = hofstaederZahlen(4);
     *  // hofstaeder(4) ausgeben
     *  System.out.println(zahlen[3]);
     * </code>
     *
     * @param n die Anzahl der Hofstaeder-Zahlen
     * @return Array mit den Hofstaeder-Zahlen
     */
    static int[] hof(int n) {
        int[] werte = new int[n];

        for(int i = 0; i<n; i++) {
            if (n == 1) {
                return 1;
            } else if (n == 2) {
                return 1;
            } else {
                return hof(n - hof(n - 1)) + hof(n - hof(n - 2));
            }
        }

        return werte;
    }

    public static void main(String[] args) {
        int n = 10;
        int[] werte = hof(n);
        for (int i=0; i<n; i++) {
            System.out.println("hof(" + (i+1) + "): " + werte[i]);
        }
    }


}

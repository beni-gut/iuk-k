package komplexitaet1;

public class BinarySearch {

    public static int search(long a[], long v) {
        return search(a, v, 0, a.length-1);
    }

    private static int search(long a[], long v, int l, int r) {
        while (r >= l) {
            int m = (l+r)/2;    // bestimme die Mitte
            if (v == a[m]){     // gefunden
                return m;
            }
            if (v < a[m]) {
                r = m-1;        // suche im linken Teil weiter
            }
            else {
                l = m+1;        // suche im rechten Teil weiter
            }
        }
        return -1;
    }
}

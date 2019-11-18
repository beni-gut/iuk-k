package komplexitaet1;

public class LinearSearch {

    static int search (long a[], long value) {
        return search(a, value, 0, a.length-1);
    }

    static int search (long a[], long value, int left, int right) {
        for (int i = left; i <= right; i++) {
            if (value == a[i]) {
                return i;
            }
        }
        return -1;
    }
}

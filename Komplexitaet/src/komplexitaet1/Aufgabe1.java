package komplexitaet1;

public class Aufgabe1 {
    static int[][] add(int[][] a, int[][] b) {
        int n = a.length;
        int[][] c = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }
}

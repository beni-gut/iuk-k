package komplexitaet1;


public class Aufgabe2 {
    static int[][] mul(int[][] a, int[][] b) {
        int n = a.length;
        int sum;
        int[][] c = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                sum = 0;
                for (int k=0; k<n; k++) {
                    sum += a[i][k] * b[k][j];
                }
                c[i][j] = sum;
            }
        }
        return c;
    }
}

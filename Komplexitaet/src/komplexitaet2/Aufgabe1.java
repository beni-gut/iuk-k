package komplexitaet2;

import java.util.Arrays;
import java.util.Random;

public class Aufgabe1 {
    public static void main(String[] args) {
        final int size = 40_000_000;
        final int count = 10;

        Random random = new Random();
        int[] bigArray = new int[size];

        for (int j = 0; j < count; j++) {
            for (int i = 0; i < bigArray.length; i++) {
                bigArray[i] = random.nextInt();
            }

            long start = System.currentTimeMillis();
            Arrays.sort(bigArray);
            long stop = System.currentTimeMillis();
            System.out.println("Time: " + (stop - start) + " ms");
        }
    }
}

package komplexitaet1;

import java.util.Arrays;
import java.util.Random;

public class Test {

    private int[] arraySizes;
    private int iterations;
    private Random random;

    public static void main(String[] args) {

        // Test test = new Test(new int[]{10, 100, 1000, 10000, 100000, 1000000}, 100000);
        Test test = new Test(new int[]{100, 100, 100, 100, 100, 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000, 1100, 1200, 1300, 1400, 1500, 1600, 1700, 1800, 1900, 2000}, 100000);
        test.measure();
    }

    public Test(int[] arraySizes, int iterations) {
        this.arraySizes = arraySizes;
        this.iterations = iterations;
        random = new Random();
    }

    public void measure() {
        System.out.println("Test");
        System.out.println("- Sizes: " + Arrays.toString(arraySizes));
        System.out.println("- Iterations: " + iterations);
        System.out.println("\tSize\tLinearSearch [ms]\tBinarySearch [ms]");
        for (int arraySize : arraySizes) {
            // create test array
            long[] array = new long[arraySize];
            // fill array with random numbers
            for (int i = 0; i < arraySize; i++) {
                array[i] = random.nextLong() % arraySize;
            }
            Arrays.sort(array);

            long start;
            long stop;

            long timeLinearSearch = 0;
            start = System.currentTimeMillis();
            for (int i = 0; i<iterations; i++) {
                long n = random.nextLong() % arraySize;
                LinearSearch.search(array, n);
            }
            stop = System.currentTimeMillis();
            timeLinearSearch += stop - start;
            //
            long timeBinarySearch = 0;
            start = System.currentTimeMillis();
            for (int i = 0; i<iterations; i++) {
                long n = random.nextLong() % arraySize;
                BinarySearch.search(array, n);
            }
            stop = System.currentTimeMillis();
            timeBinarySearch += stop - start;
            System.out.println("\t" + arraySize + " \t" + timeLinearSearch + "  \t\t\t\t" + timeBinarySearch);

        }

    }
}

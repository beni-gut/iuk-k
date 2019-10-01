public class Math {
    /**
     * Compute the maximum value of two values.
     * @param a first value
     * @param b second value
     * @return the maximum value
     */
    public static int max(int a, int b) {
        if (a>=b) {
            return a;
        } else {
            return b;
        }
    }

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

}
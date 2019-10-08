public class Aufg_4_1 {
    private static int sum = 0;
    private static void sumOfNumbers () {
        int i=0;
        while (i<9){
            i++;
            sum += i;
            System.out.println(sum);
        }
    }
    public static void main (String [] args) { sumOfNumbers(); }
}

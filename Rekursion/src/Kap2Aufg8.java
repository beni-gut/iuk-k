public class Kap2Aufg8 {

    static void ggT (int a, int b) {
        if (a > b) {
            ggT(a-b,b);
        } else if (a < b) {
            ggT(a,b-a);
        } else if (a == b) {
            System.out.println("Der ggT ist: " + a);
        }
    }

    public static void main(String[] args) {
        int a = 24;
        int b = 9;

        ggT(a,b);
    }
}

public class Aufg414 {

    private static int ggT(int x, int y) {
        while (x != y) {
            if (x > y) {
                x = x - y;
            } else {
                y = y - x;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        int x = 24;
        int y = 9;

        System.out.println("Der grösste gemeinsame Teiler von " + x + " und " + y + " ist " + ggT(x,y) + ".");
    }
}

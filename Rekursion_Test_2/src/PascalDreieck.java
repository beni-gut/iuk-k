public class PascalDreieck {

    static int pascalBerechnen (int zeile, int stelle) {
        if (stelle == 0) {
            return 1;
        } else if (zeile == stelle) {
            return 1;
        } else {
            return (pascalBerechnen(zeile-1, stelle-1) + pascalBerechnen(zeile-1, stelle));
        }
    }

    public static void main(String[] args) {
        System.out.println(pascalBerechnen(0, 0));
        System.out.println(pascalBerechnen(4, 2));
    }
}

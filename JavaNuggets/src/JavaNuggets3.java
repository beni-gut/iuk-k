public class JavaNuggets3 {
    public static void main(String[] args) {
        int i1 = 97;
        char c1 = (char) i1;
        char c2 = 48;
        int i3 = -1;
        char c3 = (char) i3;
        char c4 = (char) (c1 + 1);

        System.out.println((int) c2);
        System.out.println(c3);
        System.out.println((int) c3);
        System.out.println(c4);
        System.out.println(c1 + 1);
        System.out.println(String.valueOf(c1) + String.valueOf(c2));
    }
}

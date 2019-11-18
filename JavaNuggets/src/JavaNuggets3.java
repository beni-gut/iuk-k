public class JavaNuggets3 {
    public static void main(String[] args) {
        int i1 = 97;                //97
        char c1 = (char) i1;        //'a'
        char c2 = 48;               //'0'
        int i3 = -1;                //-1
        char c3 = (char) i3;        //Zeichen: 'nicht darstellbar'
        char c4 = (char) (c1 + 1);  //'b' int 98 gecastet

        System.out.print("Int c2: ");
        System.out.println((int) c2);
        System.out.print("c2: ");
        System.out.println(c2);
        System.out.print("c3: ");
        System.out.println(c3);
        System.out.print("Int c3: ");
        System.out.println((int) c3);
        System.out.print("c1: ");
        System.out.println(c1);
        System.out.print("c4: ");
        System.out.println(c4);
        System.out.print("c1+1: ");
        System.out.println(c1 + 1);
        System.out.println(String.valueOf(c1) + String.valueOf(c2));
    }
}

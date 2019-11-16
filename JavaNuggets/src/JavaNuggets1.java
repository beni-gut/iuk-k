public class JavaNuggets1 {
    private static void showNumbers(){
        byte a = 127;
        byte b = -128;
        //byte c = -129;
        byte d = (byte) -129;
        //byte e = a + b;
        //byte f = 2 * a;
        byte g = (byte) (a + b);
        byte h = (byte) (2 * a);
        int i = 'a' + a;
        int j = a + a;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        //System.out.println(c);
        System.out.println("d: " + d);
        //System.out.println(e);
        //System.out.println(f);
        System.out.println("g: " + g);
        System.out.println("h: " + h);
        System.out.println("i: " + i);
        System.out.println("j: " + j);
    }
    public static void main(String [] args) {
        showNumbers();
    }
}

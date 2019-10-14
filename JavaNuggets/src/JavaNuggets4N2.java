public class JavaNuggets4N2 {
    public static void main(String[] args) {
        Zahl z = new Zahl(1);
        increment(z);
        System.out.println("Die Zahl ist " + z.get()); // was wird ausgegeben?
    }
    public static void increment(Zahl z) {
        z.set(z.get()+1);
    }
}

class Zahl {
    int i;
    Zahl(int i){
        this.i= i;
    }
    public void set(int i) {
        this.i= i;
    }
    public int get() {
        return(i);
    }
}
// Datei: TestSchuh.java

public class TestSchuh {
    public static void main(String[] args) {
        int groesse;
        String hersteller;
        String modell;
        Schuh s;
        s = new Schuh();
        s.setGroesse(42);
        s.setHersteller("Mike");
        s.setModellbezeichnung("Air Ultramatic");
        s.print();
    }
}


public class TestSchuh {
    public static void main(String[] args) {
        int groesse;
        String hersteller;
        String modell;
        Schuh s;

        s = new Schuh();
        System.out.println("Direkt nach erstellen: ");
        s.print();
        System.out.println();

        s.setGroesse(42);
        s.setHersteller("Mike");
        s.setModellbezeichnung("Air Ultramatic");

        groesse = s.getGroesse();
        hersteller = s.getHersteller();
        modell = s.getModellbezeichnung();

        System.out.println("Über die get-Methoden: ");
        System.out.println("Grösse: " + groesse);
        System.out.println("Hersteller: " + hersteller);
        System.out.println("Modell: " + modell);

        System.out.println();

        System.out.println("Über die print Methode: ");
        s.print();
    }
}

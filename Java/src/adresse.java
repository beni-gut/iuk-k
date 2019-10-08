// Das ist die Klasse Adresse.
//
public class Adresse {
    private String name;
    private String vorName;
    private String strasseUndNummer;
    private int pLZ;
    private String ort;

    public Adresse(String n, String v, String s, int p, String o) {
        name = n;
        vorName = v;
        strasseUndNummer = s;
        pLZ = p;
        ort = o;
    }

    void println() {
        System.out.println(vorName + " " + name);
        System.out.println(strasseUndNummer);
        System.out.println(pLZ + " " + ort);
    }
}
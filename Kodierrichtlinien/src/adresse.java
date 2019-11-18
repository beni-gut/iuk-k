// Das ist die Klasse Adresse.
//

public class adresse {
    adresse (String N, String V, String S, int P, String O) {
        Name = N; Vorname = V;
        Strasse_und_Nummer = S;
        PLZ = P; Ort = O;
    }
    String Name, Vorname;
    String Strasse_und_Nummer;
    int PLZ;
    String Ort;

    void println() {
        System.out.println(Vorname + " " + Name);
        System.out.println(Strasse_und_Nummer);
        System.out.println(PLZ + " " + Ort);
    }
}

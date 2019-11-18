
public class Bruch {
    private int zaehler;
    private int nenner;

    public Bruch(int zaehler, int nenner) {
        this.zaehler = zaehler;
        this.nenner = nenner;
        kuerze();
    }

    public Bruch add(Bruch bruch) {
        int nenner = this.nenner * bruch.nenner;
        int zaehler = this.zaehler * bruch.nenner + bruch.zaehler * this.nenner;
        return new Bruch(zaehler, nenner);
    }

    public Bruch mul(Bruch bruch) {
        int zaehler = this.zaehler * bruch.zaehler;
        int nenner = this.nenner * bruch.nenner;
        return new Bruch(zaehler, nenner);
    }

    public int getZaehler() {
        return zaehler;
    }

    public int getNenner() {
        return nenner;
    }

    private void kuerze() {
        int ggT = ggT(zaehler, nenner);
        zaehler /= ggT;
        nenner /= ggT;
    }

    private int ggT(int zahl1, int zahl2) {
        while (zahl2 != 0) {
            if (zahl1 > zahl2) {
                zahl1 = zahl1 - zahl2;
            } else {
                zahl2 = zahl2 - zahl1;
            }
        }
        return zahl1;
    }
}

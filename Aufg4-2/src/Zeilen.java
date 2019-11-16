// Datei: Zeichen.java

public class Zeilen {
    // beachten Sie die Deklaration der Methode main() nicht
    public static void main(String[] args) throws Exception {
        int c = 0;
        int anzahl = 0;
        int leerzeichen = 0;
        int anzahlZeilen = 0;
        int anzahlZeichenProZeile = 0;
        System.out.print("Bitte eine Folge von Zeichen eingeben ");
        System.out.println("und mit <RETURN> abschliessen");
        while (c != -1) {
            // System.in.read() gibt einen int-Wert im Bereich 0 bis
            // 255 zurück. -1 wird zurückgegeben, wenn kein Zeichen
            // mehr im Dateipuffer steht.
            c = System.in.read();
            // Mit (char) c wird die int-Variable c
            // in ein Zeichen gewandelt.
            System.out.println (
                    "ASCII-Code: " + c + " Zeichen: " + (char) c);
            anzahl = anzahl + 1;
            anzahlZeichenProZeile ++;
            if (c == 32) {
                leerzeichen++;
            }
            if (c == 10) {
                System.out.println("In Zeile " + (anzahlZeilen+1) + " hat es  " + anzahlZeichenProZeile + " Zeichen.");
                anzahlZeilen++;
                anzahlZeichenProZeile = 0;
            }
        }
        System.out.println("Anzahl Zeichen: " + anzahl);
        System.out.println("Anzahl Leerzeichen: " + leerzeichen);
        System.out.println("Anzahl Zeilen: " + anzahlZeilen);
    }
}

// 10 for return
// 32 for space
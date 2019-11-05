package Kap2Aufg7;

import java.lang.Math;


public class Aufgabe7 {


    static void strecke(Dialog dialog, int Ax, int Ay, int Bx, int By) {

        if(Math.abs(Ax-Bx) <= 1 && Math.abs(Ay-By) <= 1) {
            dialog.markiere(Ax, Ay);
            dialog.markiere(Bx, By);
        } else {
            int Mx = (Ax + Bx) / 2;
            int My = (Ay + By) / 2;

            strecke(dialog, Ax, Ay, Mx, My);
            strecke(dialog, Mx, My, Bx, By);
        }
    }

    public static void main(String[] args) {
        Dialog dialog = new Dialog();

        // Zeichne eine Linie von (10,10) nach (100,100)
        // Nicht rekursiv, sondern einfach Punkt für Punkt zeichnen
        /**for (int i = 10; i < 100; i++) {
            //dialog.markiere(i,i);
        }*/

        // Zeichne eine Linie von (10,100) nach (100,10)
        // Rekursive Lösung
        strecke(dialog, 10, 10, 300, 300);

    }

}

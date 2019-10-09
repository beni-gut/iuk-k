import org.jetbrains.annotations.Contract;

/**
 * Aus einem Testprogramm wurde diese Klasse erstellt.
 *
 * @author Benjamin Gut
 * @version 1.0
 */
public class ComplexNumber {
    /**
     * Variablen
     */
    private double real;
    private double imaginary;

    /**
     * Konstruktor
     */
    public ComplexNumber (){
        real = 0.0;
        imaginary = 0.0;
    }

    /**
     *
     * @param real Realer Anteil der Komplexen Zahl wird gesetzt
     * @param imaginary Imaginärer Anteil der Komplexen Zahl wird gesetzt
     */
    public ComplexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    /**
     *
     * @return Gibt den realen Teil der Komplexen Zahl zurück
     */
    public double getReal () {
        return this.real;
    }

    /**
     *
     * @return Gibt den imaginären Teil der Komplexen Zahl zurück
     */
    public double getImaginary () {
        return this.imaginary;
    }

    /**
     *
     * @param c Eine Komplexe Zahl wird zu der bestehenden addiert
     * @return Addiert zb die komplexe Zahl 3+4i zur bestehenden komplexen Zahl 2+2i dazu und gibt danach 5+6i aus
     *
     */
    public ComplexNumber add (ComplexNumber c) {
        this.real += c.getReal();
        this.imaginary += c.getImaginary();
        return this;
    }

    /**
     *
     * @return Gibt den Betrag der komplexen Zahl, also die Wurzel aus der Summe der Quadrate von Real und Imaginärteil, aus
     */
    public double abs () {
        double abs = java.lang.Math.sqrt(java.lang.Math.pow(this.real,2.0)+java.lang.Math.pow(this.imaginary,2.0));
        return abs;
    }

    /**
     *
     * @return Gibt die komplexe Zahl als String im Format <code>a+b*c</code> aus
     */
    public String toString () {
        if (this.imaginary > 0) {
            return (this.real + "+" + this.imaginary + "i");
        } else if (this.imaginary < 0){
            return (this.real + "" + this.imaginary + "i");
        }
        return null;
    }
}

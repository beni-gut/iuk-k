import org.jetbrains.annotations.Contract;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber (){
        real = 0.0;
        imaginary = 0.0;
    }

    public ComplexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal () {
        return this.real;
    }
    public double getImaginary () {
        return this.imaginary;
    }

    /* public void add (double real, double imaginary) {
         this.real += real;
         this.imaginary += imaginary;
     }*/
    public ComplexNumber add (ComplexNumber c) {
        this.real += c.getReal();
        this.imaginary += c.getImaginary();
        return this;
    }

    /*public double abs (double real, double imaginary) {
        double abs = java.lang.Math.sqrt((real*real)+(imaginary*imaginary));
        return abs;
    }*/
    public double abs () {
        double abs = java.lang.Math.sqrt(java.lang.Math.pow(this.real,2.0)+java.lang.Math.pow(this.imaginary,2.0));
        return abs;
    }

    public String toString () {
        if (this.imaginary > 0) {
            return (this.real + "+" + this.imaginary + "i");
        } else if (this.imaginary < 0){
            return (this.real + "" + this.imaginary + "i");
        }
        return null;
    }
}

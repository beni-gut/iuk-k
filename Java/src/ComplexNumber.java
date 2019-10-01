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
    public void add (double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }
    public void testAbs (double real, double imaginary) {

    }
}

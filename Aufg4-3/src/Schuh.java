public class Schuh {
    private int groesse;
    private String hersteller;
    private String modellbezeichnung;


    public void setGroesse (int groesse){
        this.groesse = groesse;
    }

    public void setHersteller (String hersteller){
        this.hersteller = hersteller;
    }

    public void setModellbezeichnung (String modell){
        this.modellbezeichnung = modell;
    }

    public int getGroesse(){
        return groesse;
    }

    public String getHersteller(){
        return hersteller;
    }

    public String getModellbezeichnung(){
        return modellbezeichnung;
    }

    public void print(){
        System.out.println("Grösse: " + groesse);
        System.out.println("Hersteller: " + hersteller);
        System.out.println("Modell: " + modellbezeichnung);
    }
}

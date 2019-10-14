public class Person {
    private String name;
    private String vorname;

    Person(){
        String name;
        String vorname;
    }

    public void setName (String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setVorname (String vname){
        this.vorname = vname;
    }
    public String getVorname(){
        return vorname;
    }

}

public class Record {
    private int index;
    private String Nazionalità, Maschi, Femmine, Totale;

    public Record(String nazionalità, String maschi, String femmine, String totale) {
        this.Nazionalità = nazionalità;
        this.Maschi = maschi;
        this.Femmine = femmine;
        this.Totale = totale;
    }


    public String getNazionalità() {return Nazionalità;}
    public void setNazionalità(String nazionalità) {Nazionalità = nazionalità;}
    public String getMaschi() {return Maschi;}
    public void setMaschi(String maschi) {Maschi = maschi;}
    public String getFemmine() {return Femmine;}
    public void setFemmine(String femmine) {Femmine = femmine;}
    public String getTotale() {return Totale;}
    public void setTotale(String totale) {Totale = totale;}

    @Override
    public String toString() {
        return Nazionalità + "; " + Maschi + "; " + Femmine +"; " + Totale;
    }
}
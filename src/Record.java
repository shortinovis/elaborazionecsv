public class Record {
    private int index;
    private String Nazionalità, Maschi, Femmine, Totale;

    public Record(int index, String nazionalità, String maschi, String femmine, String totale) {
        this.index = index;
        Nazionalità = nazionalità;
        Maschi = maschi;
        Femmine = femmine;
        Totale = totale;
    }

    public int getIndex() {return index;}
    public void setIndex(int index) {this.index = index;}
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
        return "Record{" + "index=" + index + ", Nazionalità='" + Nazionalità + '\'' + ", Maschi='" + Maschi + '\'' + ", Femmine='" + Femmine + '\'' + ", Totale='" + Totale + '\'' + '}';
    }
}
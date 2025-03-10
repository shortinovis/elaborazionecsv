import java.util.ArrayList;
import java.io.*;
import java.util.ArrayList;

public class Gestore {
    private ArrayList<Record> lista;
    private PrintWriter writer;
    private BufferedReader reader;
    private File fileNuovo;

    public Gestore() throws IOException {
        this.lista=new ArrayList<Record>();
        this.writer=new PrintWriter(new FileWriter(this.fileNuovo));
        this.reader=new BufferedReader(new FileReader(this.fileNuovo));
    }
    public void add(Record record) {
        this.lista.add(record);
    }

    public void addCampo(){
        File nuovo
    }
    @Override
    public String toString() {
        return "Risultati{" + "lista=" + lista + '}';
    }
}

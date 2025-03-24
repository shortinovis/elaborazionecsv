import java.util.ArrayList;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Gestore {
    private File fileMio;

    public Gestore(File fileMio) {
        this.fileMio = fileMio;
    }

    public void addCampo() throws RuntimeException, IOException {
        File file = this.fileMio;
        File fileappoggio = new File("src/Cortinovis");

        try (BufferedReader reader = new BufferedReader(new FileReader(this.fileMio)); PrintWriter writer = new PrintWriter(new FileWriter(fileappoggio))) {
            Boolean primaLinea = true;
            String next;
            while ((next = reader.readLine()) != null) {
                if (primaLinea) {
                    writer.println(next + "; mioparametro; cancellazionelogica");
                    primaLinea = false;
                } else {
                    writer.println(next + "; " + (new Random().nextInt(11) + 10) + ";" + true);
                }
                writer.flush();
                writer.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (!file.delete()) {
            throw new RuntimeException("Errore nella cancellazione del file originale");
        }
        if (!fileappoggio.renameTo(fileMio)) {
            throw new RuntimeException("Errore nel rinominare il nuovo file come quello originale");
        }
    }

    public int contaCampi() throws RuntimeException {
        try (BufferedReader reader = new BufferedReader(new FileReader(this.fileMio))) {
            String[] recordControllo = reader.readLine().split(";");
            return recordControllo.length;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public int maxRecord() throws RuntimeException {
        try (BufferedReader reader = new BufferedReader(new FileReader(this.fileMio))) {
            reader.readLine(); //Elimino l'intestazione dal conteggio

            int max = 0;
            String next;
            while ((next = reader.readLine()) != null) {
                if (next.length() > max)
                    max = next.length();
            }
            return max;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void aggiungiREcord(Record record) throws RuntimeException {
        try (BufferedReader reader = new BufferedReader(new FileReader(this.fileMio)); PrintWriter writer = new PrintWriter(new FileWriter(this.fileMio, true))) {
            writer.println(record.toString());
            writer.flush();
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


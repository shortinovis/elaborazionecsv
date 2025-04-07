import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        int opzione;
        File miofile=new File("elaborazione csv/src/Cortinovis.csv");
        Gestore gestore=new Gestore(miofile);

        do {
            System.out.println("scegli  opzione:");
            System.out.println("1-Aggiunta doppio campo");
            System.out.println("2-Conta campi");
            System.out.println("3-Lunchezza massima record");
            System.out.println("4-Spaziatura fissa");
            System.out.println("5-Aggiunta record");
            System.out.println("6-Visualizzazione dati a scelta");
            System.out.println("7-Ricerca record");
            System.out.println("8-Modifica record");
            System.out.println("9-Cancellazione record");
            System.out.println("0-esci");
            opzione = t.nextInt();
            t.nextLine();
            switch (opzione) {
                case 1:
                gestore.addCampo();

                    break;
                case 2:
                gestore.contaCampi();

                    break;
                case 3:
                gestore.maxRecord();

                    break;
                case 4:

                gestore.Spaziatura();

                    break;
                case 5:

                gestore.aggiungiREcord();

                    break;
                case 6:


                    break;
                case 7:

                    break;
                case 8:


                case 9:



                    break;
                case 0:


                    System.out.println("grazie per aver usate il servizio cortinovis, alla prossima!");
                    break;
                default:
                    System.out.println("metti una tra le opzioni richieste");

            }
        } while (opzione != 0);
    }
    }
}
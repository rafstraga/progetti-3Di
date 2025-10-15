import java.util.Scanner;

public class BalneareLettini {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Acquisizione input
        System.out.print("Inserisci il numero di ore di affitto dell'ombrellone: ");
        int ore = input.nextInt();

        System.out.print("Inserisci il numero di lettini: ");
        int lettini = input.nextInt();

        double totale;

        if (ore < 4) {
            // Tariffa standard: €1.50 all'ora
            totale = ore * 1.50;
        } else {
            // Tariffa ridotta: €1.00 all'ora + €5 per ogni lettino
            totale = (ore * 1.00) + (lettini * 5.00);
        }

        // Visualizzazione del totale
        System.out.printf("Il totale da pagare è: %.2f euro\n", totale);

        input.close();
    }
}

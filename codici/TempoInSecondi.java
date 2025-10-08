import java.util.Scanner;

public class TempoInSecondi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Inserimento del tempo
        System.out.print("Inserisci le ore: ");
        int ore = input.nextInt();

        System.out.print("Inserisci i minuti: ");
        int minuti = input.nextInt();

        System.out.print("Inserisci i secondi: ");
        int secondi = input.nextInt();

        // Calcolo del totale in secondi
        int totaleSecondi = ore * 3600 + minuti * 60 + secondi;

        // Output del risultato
        System.out.println("Totale in secondi: " + totaleSecondi);

        input.close();
    }
}

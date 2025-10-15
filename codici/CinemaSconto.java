import java.util.Scanner;

public class CinemaSconto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Inserimento del prezzo del biglietto
        System.out.print("Inserisci il prezzo del biglietto: ");
        double prezzo = input.nextDouble();

        // Inserimento dell'età del cliente
        System.out.print("Inserisci l'età del cliente: ");
        int eta = input.nextInt();

        double sconto;
        if (eta < 18) {
            sconto = 0.20; // 20% di sconto per minorenni
        } else {
            sconto = 0.05; // 5% di sconto per maggiorenni
        }

        // Calcolo del prezzo scontato
        double prezzoFinale = prezzo - (prezzo * sconto);

        // Visualizzazione del prezzo da pagare
        System.out.printf("Il prezzo da pagare è: %.2f euro\n", prezzoFinale);

        input.close();
    }
}

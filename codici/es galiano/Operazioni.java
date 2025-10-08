import java.util.Scanner; // Importa la classe Scanner per leggere input da tastiera

public class Operazioni {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Crea un oggetto Scanner per leggere i dati

        // Chiede all'utente di inserire il primo numero intero
        System.out.print("Inserisci il primo numero intero: ");
        int primoNumero = input.nextInt();

        // Chiede all'utente di inserire il secondo numero intero
        System.out.print("Inserisci il secondo numero intero: ");
        int secondoNumero = input.nextInt();

        // Calcola la somma dei due numeri
        int somma = primoNumero + secondoNumero;
        System.out.println("La somma è: " + somma);

        // Calcola la sottrazione (primo meno secondo)
        int sottrazione = primoNumero - secondoNumero;
        System.out.println("La sottrazione è: " + sottrazione);

        // Calcola la moltiplicazione
        int moltiplicazione = primoNumero * secondoNumero;
        System.out.println("La moltiplicazione è: " + moltiplicazione);

        // Controlla se il secondo numero è zero prima di fare la divisione
        if (secondoNumero != 0) {
            // Esegue la divisione con risultato decimale (double)
            double divisione = (double) primoNumero / secondoNumero;
            System.out.println("La divisione è: " + divisione);
        } else {
            // Messaggio di errore se il secondo numero è zero
            System.out.println("Errore: impossibile dividere per zero.");
        }

        input.close(); // Chiude lo Scanner
    }
}

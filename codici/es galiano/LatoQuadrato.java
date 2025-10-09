// Importa la classe Scanner per leggere l'input da tastiera
import java.util.Scanner;

public class LatoQuadrato {
    public static void main(String[] args) {
        // Crea un oggetto Scanner per leggere l'input dell'utente
        Scanner input = new Scanner(System.in);

        // Chiede all'utente di inserire la lunghezza del lato del quadrato
        System.out.print("Inserisci la lunghezza del lato del quadrato: ");

        // Legge il valore inserito dall'utente e lo memorizza nella variabile lato
        // NOTA: Non viene gestito alcun errore, quindi l'utente deve inserire un numero valido
        double lato = input.nextDouble();

        // Calcola il perimetro del quadrato (somma dei 4 lati)
        double perimetro = 4 * lato;

        // Calcola l'area del quadrato (lato al quadrato)
        double area = lato * lato;

        // Visualizza il risultato del perimetro
        System.out.println("Il perimetro del quadrato è: " + perimetro);

        // Visualizza il risultato dell'area
        System.out.println("L'area del quadrato è: " + area);

        // Chiude lo scanner per liberare le risorse
        input.close();
    }
}

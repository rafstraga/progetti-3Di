import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Richiesta dei tre numeri all'utente
        System.out.print("Inserisci il primo numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Inserisci il secondo numero: ");
        double num2 = scanner.nextDouble();

        System.out.print("Inserisci il terzo numero: ");
        double num3 = scanner.nextDouble();

        // Calcolo della media aritmetica
        double media = (num1 + num2 + num3) / 3;

        // Visualizzazione del risultato
        System.out.printf("La media aritmetica è: %.2f\n", media);

        scanner.close();
    }
}

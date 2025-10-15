import java.util.Scanner;

public class EtaLocale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci la tua età: ");

        try {
            int eta ;

            if (eta < 0) {
                System.out.println("Età non valida");
            } else if (eta < 18) {
                System.out.println("Accesso non consentito ai minori");
            } else {
                System.out.println("Accesso consentito");
            }

        } catch (NumberFormatException e) {
            System.out.println("Errore di input: inserisci un numero valido");
        }

        scanner.close();
    }
}

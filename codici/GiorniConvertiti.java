import java.util.Scanner;

public class GiorniConvertiti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il numero di giorni: ");
        int giorniTotali = input.nextInt();

        int anni = giorniTotali / 365;
        int giorniRimanenti = giorniTotali % 365;

        int settimane = giorniRimanenti / 7;
        int giorniFinali = giorniRimanenti % 7;

        System.out.println("Anni: " + anni);
        System.out.println("Settimane: " + settimane);
        System.out.println("Giorni: " + giorniFinali);

        input.close();
    }
}

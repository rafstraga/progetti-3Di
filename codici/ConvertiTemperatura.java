import java.util.Scanner;

public class ConvertiTemperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Scegli la conversione:");
        System.out.println("1 = Celsius → Fahrenheit");
        System.out.println("2 = Fahrenheit → Celsius");
        int scelta = input.nextInt();

        if (scelta == 1) {
            System.out.print("Inserisci gradi Celsius: ");
            double c = input.nextDouble();
            double f = c * 1.8 + 32;
            System.out.println("Gradi Fahrenheit: " + f);
        } else if (scelta == 2) {
            System.out.print("Inserisci gradi Fahrenheit: ");
            double f = input.nextDouble();
            double c = (f - 32) / 1.8;
            System.out.println("Gradi Celsius: " + c);
        } else {
            System.out.println("Scelta non valida.");
        }

        input.close();
    }
}


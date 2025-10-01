import java.util.Scanner;

public class CalcolatriceSemplice {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Inserisci il primo numero: ");
            double num1 = input.nextDouble();
            
            System.out.print("Inserisci il secondo numero: ");
            double num2 = input.nextDouble();
            
            System.out.print("Scegli l'operazione (+, -, *, /): ");
            char operazione = input.next().charAt(0);
            
            switch (operazione) {
                case '+' -> System.out.println("Risultato: " + (num1 + num2));
                case '-' -> System.out.println("Risultato: " + (num1 - num2));
                case '*' -> System.out.println("Risultato: " + (num1 * num2));
                case '/' -> {
                    if (num2 != 0) {
                        System.out.println("Risultato: " + (num1 / num2));
                    } else {
                        System.out.println("Errore: divisione per zero!");
                    }
                }
                default -> System.out.println("Operazione non valida!");
            }
        }
    }
}

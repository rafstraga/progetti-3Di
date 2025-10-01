import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il primo numero:");
        double num1 = scanner.nextDouble();
        System.out.println("Inserisci il secondo numero:");
        double num2 = scanner.nextDouble();
        System.out.println("Scegli operazione (+, -, *, /):");
        char op = scanner.next().charAt(0);
        double risultato = 0;
        if (op == '+') risultato = num1 + num2;
        else if (op == '-') risultato = num1 - num2;
        else if (op == '*') risultato = num1 * num2;
        else if (op == '/') risultato = num1 / num2;
        System.out.println("Risultato: " + risultato);
        scanner.close();
    }
}

import java.util.Scanner;

public class Calcolatrice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Numero 1: ");
        double a = s.nextDouble();
        System.out.print("Operazione (+ - * /): ");
        char op = s.next().charAt(0);
        System.out.print("Numero 2: ");
        double b = s.nextDouble();
        double r = 0;
        if (op == '+') r = a + b;
        else if (op == '-') r = a - b;
        else if (op == '*') r = a * b;
        else if (op == '/') r = a / b;
        System.out.println("Risultato: " + r);
        s.close();
    }
}
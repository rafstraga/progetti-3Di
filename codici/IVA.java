import java.util.Scanner;

public class IVA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Prezzo: ");
        double prezzo = input.nextDouble();

        double iva = prezzo * 0.22;
        double totale = prezzo + iva;

        System.out.println("IVA: " + iva);
        System.out.println("Totale: " + totale);

        input.close();
    }
}

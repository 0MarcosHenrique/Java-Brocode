import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double temp;
        double novTemp;
        String unit;

        System.out.print("Digite a temperatura: ");
        temp = scanner.nextDouble();

        System.out.print("Converter para Celsius ou Fahrenheit? (C ou F): ");
        unit = scanner.next().toUpperCase();

        novTemp = (unit.equals("C")) ? (temp -32) * 5 / 9 : (temp * 9 / 5) + 32;

        System.out.printf("%.1f°%s", novTemp , unit);
        scanner.close();
    }
}

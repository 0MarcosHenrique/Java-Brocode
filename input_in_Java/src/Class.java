import java.util.Locale;
import java.util.Scanner;
public class Class {
    public static void main(String[] args){

        double altura = 0;
        double largura = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Digite a altura do retangulo: ");
        altura = scanner.nextDouble();

        System.out.print("Digite a largura do retangulo: ");
        largura = scanner.nextDouble();

        area = largura*altura;

        System.out.println("A área do seu retangulo é : " +area+ "cm");









    scanner.close();
    }
}

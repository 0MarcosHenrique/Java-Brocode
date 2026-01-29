import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = 0;

        do {
            System.out.print("Digite um numero entre 1 e 10: ");
            numero = scanner.nextInt();
        }while(numero < 1 || numero > 10);

        System.out.println("Voce escolheu " +numero);






        scanner.close();
    }
}

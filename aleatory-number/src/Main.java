import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        //Jogo de adivinhar o número

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attemps = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max +1);

        System.out.println("Jogo de adivinhar o número");
        System.out.printf("Adivinhe o numero entre %d-%d\n", min, max);

        do {
            System.out.print("Coloque o número que acha que é: ");
            guess = scanner.nextInt();
            attemps++;

            if(guess < randomNumber) {
                System.out.println("Muito baixo tente denovo!");
            }
            else if (guess > randomNumber) {
                System.out.println("Muito alto tente denovo!");
            }
            else {
                System.out.println("acertou, o número é: " +randomNumber);
                System.out.println("Seu número de tentativas foi "+attemps+ ".");
            }

        }while (guess != randomNumber);



        scanner.close();
    }
}

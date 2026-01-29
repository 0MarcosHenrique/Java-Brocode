import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age = 0;

        System.out.print("Digite sua idade para usar o progama: ");
        age = scanner.nextInt();

        while( age < 0 || age == 0){
            System.out.println("Sua idade não pode ser menor que 0 ou 0");
            System.out.print("Digite sua idade novamente: ");
            age = scanner.nextInt();
        }

        System.out.println("Você tem " +age+ " anos de idade");

        scanner.close();
    }
}

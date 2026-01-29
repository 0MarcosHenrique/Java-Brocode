import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while(name.isEmpty()){
            System.out.print("Digite seu nome: ");
            name = scanner.nextLine();
        }

        System.out.println("Ola "  +name);








        scanner.close();
    }
}

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nomeUsua;

        System.out.print("Digite o nome de usuario: ");
        nomeUsua = scanner.nextLine();

        if (nomeUsua.length() < 4 || nomeUsua.length() > 12) {
            System.out.println("O nome de usuario deve ter 4-12 caracteres");
        }
        else if (nomeUsua.contains(" ") || nomeUsua.contains("_") ) {
            System.out.println("O nome de usuario não pode conter espaços nem sublinhados");
        }
        else {
            System.out.println("Bem vindo " +nomeUsua);
        }
        scanner.close();
    }
}

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows;
        int colunms;
        char symbol;

        System.out.print("Digite o número de linhas: ");
        rows = scanner.nextInt();

        System.out.print("Digite o número de colunas: ");
        colunms = scanner.nextInt();

        System.out.print("Digite o símbolo que você irá usar: ");
        symbol = scanner.next().charAt(0);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colunms; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }









        scanner.close();
    }
}

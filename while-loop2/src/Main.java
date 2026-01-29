import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        String resposta = "";

        while (!resposta.equals("Q")){
            System.out.println("Você esta jogando um jogo");
            System.out.print("Aperte Q para sair: ");
            resposta = scanner.next().toUpperCase();
        }

        System.out.print("Você saiu do jogo");






        scanner.close();
    }
}

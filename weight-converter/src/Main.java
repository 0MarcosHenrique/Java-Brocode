import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        //conversor de peso

        Scanner scanner = new Scanner(System.in);

        double peso;
        double novoPeso;
        int escolha;

        System.out.println("Progama de converção de peso⚖️");
        System.out.println("1: Converter lbs para kgs");
        System.out.println("2: Converter kgs para lbs");

        System.out.print("escolha uma opção (1 ou 2): ");
        escolha = scanner.nextInt();

        if (escolha == 1){
            System.out.print("Digite o peso em lbs: ");
            peso = scanner.nextDouble();
            novoPeso = peso * 0.453592;
            System.out.printf("O novo peso em kgs é: %.2f",novoPeso);
        }
        else if (escolha == 2){
            System.out.print("Digite o peso em kgs: ");
            peso = scanner.nextDouble();
            novoPeso = peso * 2.20462;
            System.out.printf("O novo peso em kgs é: %.2f",novoPeso);
        }
        else {
            System.out.println("Está não é uma escolha valida");
        }
        scanner.close();
    }
}

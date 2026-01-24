import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia da semana: ");
        String dia = scanner.nextLine();
        dia = dia.substring(0,1).toUpperCase() + dia.substring(1);
        switch (dia){
            case "Segunda", "Terça", "Quarta", "Quinta", "Sexta" ->
                    System.out.println("É um dia da semana😟");
            case "Sábado", "Domingo" -> System.out.println("É fim de semana😀😆🎉");
            default -> System.out.println( dia + " não é um dia da semana");
        }








    }
}

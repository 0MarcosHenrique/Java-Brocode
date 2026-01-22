import java.util.Scanner;
public class Class {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);

        String adjetivo1;
        String nome;
        String adjetivo2;
        String verbo;
        String adjetivo3;


        System.out.print("Coloque um adjetivo (descritivo) : ");
        adjetivo1 = scanner.nextLine();
        System.out.print("Coloque um nome (Animal/Pessoa) : ");
        nome = scanner.nextLine();
        System.out.print("Coloque um adjetivo (descritivo) : ");
        adjetivo2 = scanner.nextLine();
        System.out.print("Coloque um verbo de ação (Ex:Aplaudindo, Gritando) : ");
        verbo = scanner.nextLine();
        System.out.print("Coloque um adjetivo (descritivo) : ");
        adjetivo3 = scanner.nextLine();

        System.out.println("Hoje eu queria muito " +adjetivo1+ " no zoo.");
        System.out.println("Na exibição eu vi " +nome+ ".");
        System.out.println(nome + " é " +adjetivo2+ " e tava " +verbo+ "!");
        System.out.println("Esse dia foi " +adjetivo3+ "!");




    }
}

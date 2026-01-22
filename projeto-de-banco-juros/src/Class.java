import java.util.Scanner;
public class Class {
        public static void main (String[] args){

    Scanner scanner = new Scanner(System.in);

    double principal;
    double taxa;
    int timesCmpounded;
    int anos;
    double montante;

    System.out.print("Digite o valor principal do montante: ");
    principal = scanner.nextDouble();

    System.out.print("Digite a taxa esperada (em %): ");
    taxa = scanner.nextDouble() / 100;

    System.out.print("Digite o tempo que os juros vão ser aplicados: ");
    timesCmpounded = scanner.nextInt();

    System.out.print("Digite o numero de anos: ");
    anos = scanner.nextInt();


    montante = principal * Math.pow(1 + taxa / timesCmpounded, timesCmpounded * anos);
    System.out.printf("o montante depois de %d anos é %.2f", anos, montante);

    scanner.close();
    }
}

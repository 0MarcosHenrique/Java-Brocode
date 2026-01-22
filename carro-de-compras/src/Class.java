import java.util.Locale;
import java.util.Scanner;
public class Class {
    public static void main (String[]args){


        String item;
        double preco;
        int quant;
        double valor;
        String moeda = "R$";

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.print("Qual produto você gostaria de comprar: ");
        item = scanner.nextLine();

        System.out.print("Por favor digite o  preço desse produto: ");
        preco = scanner.nextDouble();

        System.out.print("Digite a quantidade itens você esta levando: ");
        quant = scanner.nextInt();

        valor = preco * quant;

        System.out.println("Você esta levando " +quant+ " " +item+ " ");
        System.out.println("O total deu " +moeda+ valor);














        scanner.close();
        }
    }

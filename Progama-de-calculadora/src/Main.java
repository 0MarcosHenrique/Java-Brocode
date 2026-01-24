import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double num1;
        double num2;
        char operador;
        double resultado = 0;
        boolean OperaValid = true;

        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextDouble();

        System.out.print("escolha o operador da sua equação (+, -, *, /, ^): ");
        operador = scanner.next().charAt(0);

        System.out.print("Digite o segundo numero: ");
        num2 = scanner.nextDouble();

        switch (operador) {
            case '+' -> resultado = num1 + num2;
            case '-' -> resultado = num1 - num2;
            case '*' -> resultado = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.print("não pode ser divido por 0");
                    OperaValid = false;
                } else {
                    resultado = num1 / num2;
                }
            }
            case '^' -> resultado = Math.pow(num1, num2);
            default -> {
                System.out.println("Seu operador não é valido");
                OperaValid = false;
            }
        }

        if (OperaValid){
            System.out.println(resultado);
        }

        scanner.close();
        }
    }


import java.util.Scanner;
public class Class {
    public static void main (String[]args){

        //C = 2 * Math.PI * radius
        //area = Math.PI * Math.pow(radius, 2)
        // volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)

        Scanner scanner = new Scanner(System.in);

        double radius;
        double circunferencia;
        double volume;
        double area;

        System.out.print("escreva o raio: ");
        radius = scanner.nextDouble();

        circunferencia = 2 * Math.PI * radius;

        System.out.println("A circunferencia é " +circunferencia+ "cm");

        scanner.close();
    }
}

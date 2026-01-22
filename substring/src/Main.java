import java.util.Scanner;

public class Main {
    public static void main (String[]args){

        Scanner scanner = new Scanner(System.in);


        String email;
        String username;
        String domain;

        System.out.print("Escreva seu email: ");
        email = scanner.nextLine();

        if (email.contains("@")){
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@"));

            System.out.println("seu nome de usuario de email é: " + username);
            System.out.println("seu dominio de email é :" + domain);
        }
        else{
            System.out.println("Seu email deve conter @!!");
        }


    }
}

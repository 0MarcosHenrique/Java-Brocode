import java.util.Locale;

public class Main {
    public static void main (String[]argd){

        String name = "Marcos Henrique";

        //int length = name.length();
        //char letter = name.charAt(0);
        //int index = name.indexOf(" ");
        //int lastIndex = name.lastIndexOf("i");

        //name = name.toUpperCase();
        //name = name.toLowerCase();
        //name = name.trim();
        //name = name.replace("i", "a");

        /*
        if (name.isEmpty()) {
            System.out.println("Seu nome esta vazio");
        }
        else{
            System.out.println("Seja bem vindo " + name);
        }

        if (name.contains(" ") ){
            System.out.println("seu nome contem espaços");
        }
        else{
            System.out.println("Seu nome não contem espaços!!!");
        }*/

        if (name.equals("password")){
            System.out.println("Seu nome não pode ser a senha!!!");
        }
        else {
            System.out.println("Ola " + name );
        }
    }
}

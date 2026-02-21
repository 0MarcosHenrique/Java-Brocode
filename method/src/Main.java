public class Main {
    public static void main(String[] args){

    int age = 16;

    if (ageCheck(age)){
        System.out.println("Você pode se inscrever");
        }
    else {
        System.out.println("Você não pode se inscrever");
    }

    }

    static void felizAniversario(String name, int age){ }

    static double square(double number) {
        return number * number;
    }

    static double cube (double number) {
        return number * number * number;
    }

    static String pegarNomeCompleto (String first, String last){
        return first + " " + last;
    }

    static boolean ageCheck(int age){
        if(age >= 18){
            return true;
        }
        else {
            return false;
        }

    }
}

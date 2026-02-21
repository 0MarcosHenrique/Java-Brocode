public class Main {
    public static void main(String[] args){

        String name = "Marcos";
        int age = 18;

        felizAniversario(name, age);
    }
    static void felizAniversario(String name, int age){
        System.out.println("Parabens pra você!!!");
        System.out.printf("Parabens pro %s!\n", name);
        System.out.printf("Voce esta fazendo %d anos de idade\n", age);
        System.out.println("Feliz aniversario\n");
    }
}

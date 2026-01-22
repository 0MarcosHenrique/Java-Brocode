import java.util.Scanner;

public class Main {
    public static  void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

    String name;
    int age;
    boolean isStudent;

    System.out.print("Escreva seu nome: ");
    name = scanner.nextLine();

    System.out.print("Digite sua idade: ");
    age = scanner.nextInt();

    System.out.println("Você é um estudante (true/false): ");
    isStudent = scanner.nextBoolean();

    //GRUPO 1
    if(name.isEmpty()){
        System.out.println("Você não escreveu seu nome!😡");
    }
    else{
        System.out.println("Olá " + name + " !😊");
    }
    //GRUPO 2
    if(age >= 65){
        System.out.println("Você é um idoso!👨‍🦳");
    }

    else if(age >= 18){
        System.out.  println("Você é adulto😉");
    }

    else if (age < 0){
        System.out.println("Você ainda não nasceu!!!!😡");
    }
    else if(age == 0){
        System.out.println("Você é um bebê!!!👶");
    }
    else{
         System.out.println("Você é uma criança🧒");
    }

    //grupo 3

        if(isStudent){
            System.out.print("Você é um estudante!🧑‍🎓👩‍🎓");
        }
        else{
            System.out.print("Você não é um estudante😒");
        }

            scanner.close();
        }
    }


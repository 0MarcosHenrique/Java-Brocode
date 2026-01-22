//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 import java.util.Scanner;

class Main {
    public static void main(String[] args) {
Scanner obj  = new Scanner(System.in);
System.out.print("Digite o seu nome:");

String nome = obj.nextLine();
System.out.println("Bem vindo " + nome);

Scanner sc = new Scanner(System.in);
System.out.print("Qual seu peso?");
 double peso = sc.nextDouble();


Scanner n2obj = new Scanner(System.in);
System.out.print( nome+ " Qual sua altura?");
float altura = n2obj.nextFloat();

Scanner n3obj = new Scanner(System.in);
    System.out.print(nome+ " Qual sua idade");
int idade = n3obj.nextInt();

 double imc = peso / (altura * altura);
System.out.println ( nome+ "Seu imc é: " +imc+ "." );

System.out.println("banana");



        }
    }

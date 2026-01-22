public class Class {
    public static void main (String[]args){

    boolean isStudent = true;
    boolean isSenior = true;
    double price = 9.99;

    if(isStudent){
        if (isSenior){
            System.out.println("Você ganhou um desconto de senior e estudante de 30%");
            price *= 0.7;
        }
        else {
            System.out.println("Voce ganhou um desconto de estudante de 10%");
            price *= 0.9;
        }
    }
    else{
        if (isSenior) {
            System.out.println("Você ganhou um desconto de senior de 20%");
            price *= 0.8;
        }
        else{
            price *= 1;
        }
        }
        System.out.printf("o preço do ingresso é: %.2f ", price);
    }
}


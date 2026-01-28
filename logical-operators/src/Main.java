public class Main {
    public static void main (String[] args) {
        // && = AND (e)
        // || = OR (ou)
        // ! = NOT (não)

        double temp = 50;
        boolean ensolarado = false;

        if(temp <= 30 && temp >= 0 && ensolarado){
            System.out.println("O clima está muito bom😊");
            System.out.println("Está ensolarado lá fora☀️");
        }
        else if(temp <= 30 && temp >= 0 && !ensolarado) {
            System.out.println("O clima está bom😊");
            System.out.println("Está nublado la fora☁️");
        }
        else if(temp > 30 || temp < 0 ) {
            System.out.println("O clima está ruim😟");

        }


    }
}

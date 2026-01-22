import java.util.Random;
public class Class {
    public static void main (String[] args){

        Random random = new Random();

        boolean eCara;

        eCara = random.nextBoolean();


        if(eCara){
            System.out.println("Caiu cara");
        }
        else{
            System.out.println("Caiu coroa");
        }



    }
}

import java.util.Random;
import java.util.Scanner;
public  class random{
  public static void main(String[] args){
    Scanner sn = new Scanner(System.in);
    Random rand = new Random();
    int randNum = rand.nextInt(1000);
    int intentos = 1;
      while(true){
        System.out.print(" Adivine el numero (entre 0 - 999) -> ");
        int userNum = sn.nextInt();
        if(userNum > randNum){
           intentos ++;
           System.out.println(" Es muy alto!");
        }else if(userNum < randNum){
            intentos ++;
            System.out.println(" Es muy bajo!");
        }else{
            System.out.print(" Adivinaste! el numero es " + randNum + ". Cantidad de intentos: " + intentos);
            break;
        }
     }
  }
}

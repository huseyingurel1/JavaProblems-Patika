import java.util.Scanner;

public class ActivitySuggestion {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the temprature");
        int degree =scan.nextInt();

        if (degree<5){
            System.out.println("you can ski ");

        }else if(degree>5 && degree <10){

            System.out.println("you can go to cinema ");
        }else if(10< degree && degree <15){

            System.out.println("you can go to cinema or picnic  ");
        }else if(15<degree && degree <25){

            System.out.println("you can go to picnic ");
        }else if(25< degree){

            System.out.println("you can swim  ");
        }else{

            System.out.println("hava  " + degree + "   derece");
        }
    }
}

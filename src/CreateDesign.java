import java.util.Scanner;

public class CreateDesign {

   static boolean isReachZero = false;


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number =scanner.nextInt();

        int firstValue = number;
        createDesign(number, firstValue);

    }

    static void createDesign(int number, int firstValue){

        if(isReachZero){
            if(number == firstValue){
                System.out.println("***********   End  *************");
            }else{
                number+=5;
                System.out.println(number);
                createDesign(number,firstValue);
            }

        }else{
            number-=5;
            System.out.println(number);

            if(number <= 0) {
                isReachZero=true;
                createDesign(number,firstValue);
            }else{
                createDesign(number,firstValue);
            }


        }
    }
}

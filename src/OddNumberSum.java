import java.util.Scanner;

public class OddNumberSum {
    public static void main(String[] args) {
        int number,totalNumber = 0;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Please enter a number");
            number = scan.nextInt();
            if(number%2==1){
                totalNumber= totalNumber+number ;
            }
        }while(number>0);
        System.out.println("totalNumber = " + totalNumber);
    }
}

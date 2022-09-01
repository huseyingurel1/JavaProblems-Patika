import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a number");
        int number = scanner.nextInt();
        int sum = 0;

        for (double i = 1; i < number; i++) {

            if(number%i==0) {
                sum+=i;
                System.out.println("sum = " + sum);

            }
        }
        if(sum==number){
            System.out.println(number+ "is perfect number");
        }else{
            System.out.println("Not a perfect number");
        }

    }
}

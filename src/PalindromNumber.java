import java.util.Scanner;

public class PalindromNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scanner.nextInt();

        int number2 = number;
        int reverseNumber = 0;
        int lastNumber;

        while(number2 != 0){
            lastNumber = number2%10;

            reverseNumber = (reverseNumber *10 )+ lastNumber;

            number2/=10;
        }
        System.out.println("reverseNumber = " + reverseNumber);

        String result = (reverseNumber == number) ? "palindrom" : "not a palindrom ";
        System.out.println("result = " + result);







    }
}

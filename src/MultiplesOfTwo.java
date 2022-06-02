import java.util.Scanner;

public class MultiplesOfTwo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number = scan.nextInt();

        for (int i = 2; i <= number ; i*=2) {
            System.out.println("i = " + i);
        }
    }
}

import java.util.Scanner;

public class Pow {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number");
        int n = scan.nextInt();

        System.out.println("Enter second number");
        int k = scan.nextInt();
        int total =1;

        for (int i = 1; i <= k ; i++) {
            total *= n;
        }
        System.out.println("total = " + total);
    }
}

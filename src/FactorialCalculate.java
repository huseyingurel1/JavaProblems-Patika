import java.util.Scanner;

public class FactorialCalculate {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number for Factorial Calculation ");
        int n = scan.nextInt();
        int total = 1;

        for (int i = 1; i <= n ; i++) {
            System.out.println("i = " + i);
            total = total * i ;
        }
        System.out.println("total = " + total);
    }
}

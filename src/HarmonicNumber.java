import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextInt();
        double result=0;
        System.out.println( "sayı giriniz");
        for (int i = 1; i <= number; i++) {

             result += 1.0/i;

        }
        System.out.println("result = " + result);
        System.out.println( "yeni bir sayı giriniz");

    }
}

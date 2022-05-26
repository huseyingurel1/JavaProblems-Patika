import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        int number , sumOfDivisor= 0 ,sumOfOdd= 0 ,divider=0 ;
        double average=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        number = scan.nextInt();

        if(number>0){
            System.out.println("Calculating...");
            for (int i = 1; i <= number; i++) {
                if(i%3==0 && i%4==0){
                    divider++;
                    sumOfDivisor = sumOfDivisor + i;
                }
            }
            System.out.println("...");
        }else System.out.println("Please enter a valid number");


        average = sumOfDivisor / divider ;
        System.out.println("divider = " + divider);
        System.out.println("average = " + average);
        System.out.println("3 e ve ya 4 e bölünen sayılar = " +sumOfDivisor);

    }
}

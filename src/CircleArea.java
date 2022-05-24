import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        int r;
        double pi = 3.14 ;

        Scanner scan = new Scanner(System.in);
        r= scan.nextInt();

        double circleArea= pi * Math.pow(r,2);
        double periMeter = 2 * pi * r;

        System.out.println("Peri Meter = " + periMeter);
        System.out.println("Circle Area = " + circleArea);

    }
}

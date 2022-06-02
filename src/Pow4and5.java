import javax.lang.model.SourceVersion;
import java.util.Scanner;

import static java.lang.Math.pow;

public class Pow4and5 {
    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        number = scan.nextInt();

        for (int i = 4; i <number ; i*=4) {
            System.out.println("Pow of 4 = " + i);
        }
        for (int x = 5; x <number ; x*=5) {
            System.out.println("Pow of 4 = " + x);
        }

//        ----------------------Math.pow(4,number)----------------------
//        double total4=0;
//        double total5 =0;
//        for (int i = 1; i <= number; i++) {
//
//            double pow4 = Math.pow(4,i);
//            System.out.println("pow4 = " + pow4);
//            total4 = total4 + pow4;
//
//            double pow5 = Math.pow(5,i);
//            System.out.println("pow5 = " + pow5);
//            total5 = total5 + pow5;
//
//        }
//        System.out.println("pow4 = " + total4);
//        System.out.println("pow5 = " + total5);


    }
}

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

            int FibonacciNumber,n1=0,n2=1,n3;

            Scanner inp = new Scanner(System.in);
            System.out.print("Please Enter a number: ");
            FibonacciNumber = inp.nextInt();


            for (int i = 1  ;i< FibonacciNumber;i++){
                n3=n1+n2;
                System.out.print(n1 + " + " +n2 + " = "+n3);
                n1=n2;
                n2=n3;
                System.out.println();
            }


    }
}

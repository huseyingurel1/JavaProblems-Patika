import java.util.Scanner;

public class CalculationHypotenuse {
    public static void main(String[] args) {

        double a , b , c2 ,c ;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Write the length of the vertical side");
        a = scanner.nextDouble();

        System.out.print("Write the length of the horizontal side");
        b = scanner.nextDouble();

        c2 = Math.pow(a,2)+Math.pow(b,2);

        c = Math.sqrt(c2);
        System.out.println("c = " + c);



    }
}

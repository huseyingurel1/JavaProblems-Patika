import java.util.Scanner;

public class TaxiMeter {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20 , total , startPrice = 10;

        Scanner scan = new Scanner(System.in);
        System.out.print("enter the distance in km : ");
        km = scan.nextInt();

        total=( km * perKm );
        total+=startPrice;

        total =(total < 20) ? 20 : total ;
        System.out.println("the amount you have to pay is  = " + total );


    }

}

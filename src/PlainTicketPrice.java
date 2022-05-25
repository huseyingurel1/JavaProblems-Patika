import java.util.Scanner;

public class PlainTicketPrice {
    public static void main(String[] args) {
        int km, age ,select;
        double perKmPrice = 1;

        Scanner scan = new Scanner(System.in);

        System.out.println("please enter the distance(km)");
        km = scan.nextInt();

        System.out.println("please enter your age");
        age = scan.nextInt();

        System.out.println("Is your flight one-way or two-way?('1' or '2')");
        select = scan.nextInt();

        double totalPrice = km * perKmPrice ;
        switch(select){
            case 1:
                System.out.println("You selected a one-way flight, the discount could not be defined :( ");

                if(1<= age && age< 12){
                    double result = totalPrice - (totalPrice * 0.50) ;
                    System.out.println(totalPrice);
                    System.out.println("Discount applied to your ticket because you are under 12 years old :) updated price = "+result);
                }else if(12<= age && age< 24){
                    double result = totalPrice - (totalPrice * 0.10) ;
                    System.out.println(totalPrice);
                    System.out.println("Discount applied to your ticket because you have a student discount :) updated price = "+result);
                }else if(age>65){
                    double result = totalPrice - (totalPrice * 0.30) ;
                    System.out.println(totalPrice);
                    System.out.println("Discount applied to your ticket because yyou have a retirement discount :) updated price = "+result);
                }else {
                    double result = totalPrice ;
                    System.out.println("the amount you have to pay is " + result + "  dollars");
                }
                break;

            case 2:

                if(1<= age && age< 12){
                    double result = (totalPrice - (totalPrice * 0.50))*0.8 ;
                    System.out.println(totalPrice);
                    System.out.println("Discount applied to your ticket because you are under 12 years old :) updated price = "+result*2);
                }else if(12<= age && age< 24){
                    double result = (totalPrice - (totalPrice * 0.10))*0.8 ;
                    System.out.println(totalPrice);
                    System.out.println("Discount applied to your ticket because you have a student discount :) updated price = "+result*2);
                }else if(age>65){
                    double result = (totalPrice - (totalPrice * 0.30))*0.8 ;
                    System.out.println(totalPrice);
                    System.out.println("Discount applied to your ticket because you have a retirement discount :) updated price = "+result*2);
                }else {
                    double result = totalPrice * 0.8 ;
                    System.out.println("the amount you have to pay is " + result*2 + "  dollars");
                }
                break;
            default:
                System.out.println("please enter a valid number ( OneWay = 1   , TwoWay = 2) ");

        }

    }
}

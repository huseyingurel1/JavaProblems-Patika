import java.util.Scanner;

public class GroceryStore {
    public static void main(String[] args) {

        double  pear = 2.14 , apple = 3.67, tomato = 1.11, banana=0.95, aubergine=5.00 , kg;

        Scanner scan = new Scanner(System.in);

        System.out.println("HOW MANY KG DO YOU WANT PEAR?");
        kg = scan.nextDouble();
        double pearTotal = kg * pear ;
        System.out.println("pearTotal = " + pearTotal);

        System.out.println("HOW MANY KG DO YOU WANT APPLE?");
        kg = scan.nextDouble();
        double appleTotal = kg * apple ;
        System.out.println("appleTotal = " + appleTotal);

        System.out.println("HOW MANY KG DO YOU WANT TOMATO?");
        kg = scan.nextDouble();
        double tomatoTotal = kg * tomato ;
        System.out.println(" tomatoTotal = " + tomatoTotal);

        System.out.println("HOW MANY KG DO YOU WANT BANANA?");
        kg = scan.nextDouble();
        double bananaTotal = kg * banana ;
        System.out.println("bananaTotal = " + bananaTotal);

        System.out.println("HOW MANY KG DO YOU WANT AUBERGINE?");
        kg = scan.nextDouble();
        double aubergineTotal = kg * aubergine ;
        System.out.println("aubergineTotal = " + aubergineTotal);

        double totalAmount = pearTotal + appleTotal + tomatoTotal + bananaTotal + aubergineTotal ;
        System.out.println("totalAmount = " + totalAmount);












    }
}

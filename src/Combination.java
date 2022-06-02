import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int customer, choose, a=1, b=1, c=1, i;
        double comb;

        System.out.println("Customer number: ");
        customer = scan.nextInt();
        System.out.println("Choose number:  ");
        choose = scan.nextInt();

        for ( i = 1; i <=customer ; i++) {
            a *=i;
        }
        for ( i = 1; i <=choose ; i++) {
            b *=i;
        }
        for ( i = 1; i <= (customer - choose) ; i++) {
            a *=i;
        }
        comb = a / (b*c);
        System.out.println("komb = " + comb);



    }
}

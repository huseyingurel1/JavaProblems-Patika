import java.util.Scanner;

public class DiamondWithStar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("sayı giriniz");
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            star(n,i);
        }
        for (int i = n; i >= 0; i--) {
            star(n,i);
        }
    }
    private static void star(int n,int i) {
        for(int l=0; l < (n-i); l++) {
            System.out.print(" ");
        }
        for(int k=0; k < (2*i+1); k++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}

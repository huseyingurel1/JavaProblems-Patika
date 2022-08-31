import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ilk Sayı");
        int n1 = scanner.nextInt();

        System.out.println("ikinci Sayı");
        int n2 = scanner.nextInt();
        int ebob = 0;
        int ekok = 0;

        if (n1 <= n2) {

            for (int i = 1; i <= n1; i++) {
                if(n1%i==0  && n2%i==0) {
                    ebob = i;
                }
            }
            System.out.println("ebob = " + ebob);

            ekok = (n1*n2) / ebob;
            System.out.println("ekok = " + ekok);

        }else {
            for (int i = 1; i <= n2; i++) {
                if(n1%i==0  && n2%i==0) {
                    ebob = i;
                }
            }
            System.out.println("ebob = " + ebob);

            ekok = (n1*n2) / ebob;
            System.out.println("ekok = " + ekok);

        }

    }
}

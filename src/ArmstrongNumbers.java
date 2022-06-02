import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        int number =0;
        int number1 =0;
        int toplam=0;

        Scanner scan = new Scanner(System.in);

        System.out.println(" Please Enter a NUmber");
        number = scan.nextInt();
        int kb=0;
        while ( number > 0) {
            kb++;
            number1 = number % 10;
            System.out.println("number1 = " + number1);
            toplam += number1 ;
            number = number / 10 ;
        }
        System.out.println("Basamak sayısı = " + kb);
        System.out.println("toplam = " + toplam);




    }
}

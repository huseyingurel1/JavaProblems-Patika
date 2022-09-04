import java.util.Scanner;


public class ExponentialNumber {
    static int exponentialNumber(int number1, int number2){
        if (number2==0)
            return 1;
        else if(number1==1)
            return 1;
        else{
            return number1*exponentialNumber(number1, number2-1);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Taban Sayısını Giriniz");
        int number1 = scanner.nextInt();
        System.out.println("Üs Sayıyı Giriniz");
        int number2 = scanner.nextInt();

        System.out.print(exponentialNumber(number1,number2));

    }
}

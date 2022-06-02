import java.util.Scanner;

public class OddNumberDivided {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int oddNumber=1 , sumNumber2 = 0 , sumNumber4 = 0;

        do {
            System.out.println("Please Enter a OddNumber");
            oddNumber = scan.nextInt();

            if(oddNumber%2 == 0){
                sumNumber2 = sumNumber2+oddNumber;

                if(oddNumber%4 == 0){
                    sumNumber4 = sumNumber4+oddNumber;
                }
            }
        }while(oddNumber%2==0 && oddNumber!=0 );

        int total = sumNumber2+sumNumber4;
        System.out.println("sumNumber2 = " + sumNumber2);
        System.out.println("sumNumber4 = " + sumNumber4);
        System.out.println("total = " + total);

    }
}

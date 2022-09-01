import java.util.Scanner;

public class FindMinMaxValue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number of entries");
        int n = scanner.nextInt();
        int biggestNumber =0;
        int smallestNumber =0;

        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();

            if(i==0){
                biggestNumber = number;
                smallestNumber = number;
            }else{
                if (number > biggestNumber) {
                    biggestNumber = number;
                }
                if (number < smallestNumber) {
                    smallestNumber = number;
                }
            }
        }
        System.out.println("biggestNumber = " + biggestNumber);
        System.out.println("smallestNumber = " + smallestNumber);

    }
}

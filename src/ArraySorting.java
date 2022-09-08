import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number of item");
        int n = scanner.nextInt();

        int[]array = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Please enter " + (i+1) + ". number");
            int number = scanner.nextInt();
            array[i] = number;
        }

        Arrays.sort(array);
        System.out.println("array = " + Arrays.toString(array));

    }
}

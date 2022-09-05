import java.util.Arrays;
import java.util.Scanner;

public class MaxMinArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = {15,12,18,1,-16,-38,2,0};
        int min = list[0];
        int max = list[0];

        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        System.out.print("Girilen Sayi : ");
        int number = input.nextInt();

        for(int i:list){
            if(i<number){
                min=i;
            }
            if(i>number){
                max=i;
                break;
            }
        }
        System.out.println( "The closest number smaller than the entered number: " + min );
        System.out.println( "The nearest number greater than the entered number: " + max );
    }

}

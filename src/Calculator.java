import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        double firstNumber;
        double secondNumber;
        int process ;
        double result;
        Scanner scan = new Scanner(System.in);

        System.out.print("please enter a number =  ");
        firstNumber = scan.nextDouble();

        System.out.print("please enter a number =  ");
        secondNumber = scan.nextDouble();

        System.out.print("1-Collection= '+'\n2-Extraction ' - ' \n3-Division'/' \n4-Multiplication '*'    =  ");
        process = scan.nextInt();


        switch (process){
            case 1 :
                result = firstNumber + secondNumber;
                System.out.println(firstNumber+  "+"   +secondNumber);
                System.out.print("result of collection =  " +result);
                break;

            case 2:
                result = firstNumber - secondNumber;
                System.out.println(firstNumber+  "-"   +secondNumber);
                System.out.println("result of subtraction = "+result);
                break;

            case 3:
                result = firstNumber / secondNumber;
                System.out.println(firstNumber+  "/"   +secondNumber);
                System.out.println("result of division = " +result);
                break;

            case 4:
                result = firstNumber * secondNumber;
                System.out.println(firstNumber+  "*"   +secondNumber);
                System.out.println("result of multiplication = " +result);
                break;

            default:
                System.out.println(firstNumber+  "?"   +secondNumber);
                System.out.println("please enter a valid transaction");
                break;

        }
    }
}

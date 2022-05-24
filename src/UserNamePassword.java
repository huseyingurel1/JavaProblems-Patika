import java.util.Scanner;

public class UserNamePassword {
    public static void main(String[] args) {
        while(1 == 1) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your UserName ");
            String userName = scan.nextLine();
            System.out.println("Enter your Password ");
            String password = scan.nextLine();

            if (userName.equals("huseyingurel")  && password.equals("huseyingurel123")){
                System.out.println("Congratulations you are enter this app");
               break;
            }else if(!userName.equals("huseyingurel")  && !password.equals("huseyingurel123")){
                System.out.println("Check your username and password");

            } else if (userName.equals("huseyingurel")  && !password.equals("huseyingurel123")){
                System.out.println("Check your password");
            }else{
                System.out.println("No user found with this name");
            }
            System.out.println("************************************************");
            System.out.println(" Please re-enter your information");
        }
    }
}

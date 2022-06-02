import java.util.Scanner;

public class AtmProject {
    public static void main(String[] args) {

        String userName ="Hüseyin";
        String password ="1234";
        String userName1 ,password1;
        Scanner scan = new Scanner(System.in);

        int remaining=4;
        int balance;
        int choose;
        while(remaining>0) {

            System.out.println("Enter your user name");
            userName1 = scan.nextLine();
            System.out.println("Enter your password");
            password1 = scan.nextLine();

            if (userName.equals(userName1) && password.equals(password1)) {
                System.out.println("Welcome to the SoftwareBank ");

                remaining = 4;
                balance = 102520;

                do {
                    System.out.println("which operation do you want to do?\n"
                            + "1- Balance Inquiry\n"
                            + "2- Deposit\n"
                            + "3- Withdraw\n"
                            + "4- Withdrawing a loan\n"
                            + "5- Exit"
                    );

                    choose = scan.nextInt();

                    switch (choose) {
                        case 1:
                            System.out.println("Balance = " + balance);

                            break;
                        case 2:
                            System.out.println("The Balance in Your Account = " + balance);
                            int ytutar = scan.nextInt();
                            balance = balance + ytutar;
                            System.out.println(" Current Balance = " + balance);
                            break;
                        case 3:
                            System.out.println("The Balance in Your Account = " + balance);
                            int çtutar = scan.nextInt();
                            if(balance>=çtutar){
                                balance = balance - çtutar;
                                System.out.println(" The Remaining Balance = " + balance);
                            }else{
                                System.out.println("There is not enough money in your account that you want to withdraw, you are redirected to the homepage");
                            }
                            break;
                        case 4:
                            if (balance > 10000) {
                                System.out.println("You have received a $10000 loan from our bank with 2% interest");
                            } else {
                                System.out.println("Your account balance is insufficient to withdraw a loan");
                            }
                            break;

                        case 5:
                            System.out.println("logging out of your account we wish you a good day");
                            break;

                        default:
                            System.out.println(" You Have Made A Missing Or Incorrect Key, Please Try Again ");
                    }

                } while (choose != 5);

            } else {
                //the case where the password is incorrect
                remaining -= 1;
                System.out.println("remaining = " + remaining);
            }
        }
        System.out.println("You have entered incorrectly 3 times, your account is temporarily blocked");
    }
}

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year ;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year");
        year = scan.nextInt();


        if(year%100!=0 && year%4==0){
            System.out.println(year+"   Artık yıldır");
        }else if(year%100==0 && year%400==0 ) {
            System.out.println(year+ "  Artık yıldır" );
        }else System.out.println(year+" Artık yıl değildir");








//        if(year%400==0){
//                if(year%400==0){
//                    System.out.println("bu bir artık yıldır");
//                }else{
//                    //4 e bölünür 100 e bölünür 400e bölünmez
//                    System.out.println("bu bir artık yıl değildir");
//                }
//            }else{
//                //4e bölünür ama 100e bölünmez
//                System.out.println("4e bölünür ama 100e bölünmez artık yıldır");
//            }




    }
}

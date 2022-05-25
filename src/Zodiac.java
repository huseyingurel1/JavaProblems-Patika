import java.util.Scanner;

public class Zodiac {
    public static void main(String[] args) {
        int month , day ;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your birth month");
        month = scan.nextInt();

        System.out.println("Enter your birthday");
        day = scan.nextInt();

        switch(month){
            case 1:
                String january=(day>=22)? " Aquarius " : " Capricorn";
                System.out.println("Your sign is = " + january);
                break;
            case 2:
                String february=(day>=20)? " Pisces " : " Aquarius ";
                System.out.println("Your sign is = " + february);
                break;
            case 3:
                String march=(day>=21)? " Aries " : " Pisces ";
                System.out.println("Your sign is = " + march);
                break;
            case 4:
                String april=(day>=21)? " Taurus " : " Aries ";
                System.out.println("Your sign is = " + april);
                break;
            case 5:
                String may=(day>=22)?" Gemini " : " Taurus ";
                System.out.println("Your sign is = " + may);
                break;
            case 6:
                String june=(day>=23)? " Cancer " : " Gemini ";
                System.out.println("Your sign is = " + june);
                break;
            case 7:
                String july=(day>=23)? " Leo " : " Cancer ";
                System.out.println("Your sign is = " + july);
                break;
            case 8:
                String august=(day>=23)? " Virgo " : " Leo ";
                System.out.println("Your sign is = " + august);
                break;
            case 9:
                String september=(day>=23)? " Libra " : " Virgo";
                System.out.println("Your sign is = " + september);
                break;
            case 10:
                String october=(day>=23)? " Scorpio " : " Libra";
                System.out.println("Your sign is = " + october);
                break;
            case 11:
                String november=(day>=22)? " Sagittarius" : " Scorpio ";
                System.out.println("Your sign is" + november);
                break;

            default:
                String december=(day>=22)? " Capricorn" : " Sagittarius ";
                System.out.println("Your sign is" + december);


        }

    }
}

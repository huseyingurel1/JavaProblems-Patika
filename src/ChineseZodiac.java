import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {

        int birthYear, remainingNumber ;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Birth Year");
        birthYear =scan.nextInt();

        remainingNumber = birthYear%12;

        switch(remainingNumber){
            case 0 :
                System.out.println("your chinese zodiac = Monkey ");
                break;
            case 1 :System.out.println("your chinese zodiac = Cockerel ");
                break;
            case 2 :System.out.println("your chinese zodiac = Dog ");
                break;
            case 3 :System.out.println("your chinese zodiac = Pork ");
                break;
            case 4 :System.out.println("your chinese zodiac = Mouse ");
                break;
            case 5 :System.out.println("your chinese zodiac = Ox ");
                break;
            case 6 :System.out.println("your chinese zodiac = Tiger ");
                break;
            case 7 :System.out.println("your chinese zodiac = Rabbit  ");
                break;
            case 8 :System.out.println("your chinese zodiac = Dragon ");
                break;
            case 9 :System.out.println("your chinese zodiac =  Snake ");
                break;
            case 10 :System.out.println("your chinese zodiac = Horse ");
                break;
            case 11 :System.out.println("your chinese zodiac = Sheep ");
                break;

            default:
                System.out.println("Please enter a Valid BirthYear");

        }







    }
}

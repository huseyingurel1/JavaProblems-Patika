package BodyMassIndex;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double height , weight , bodyMassIndex ;

        Scanner scan = new Scanner (System.in);

        System.out.print("enter your height(m)");
        height=scan.nextDouble();

        System.out.print("enter your weight(kg)");
        weight=scan.nextDouble();

        bodyMassIndex = weight / (height * height) ;

        System.out.print("bodyMassIndex = " + bodyMassIndex);


    }
}

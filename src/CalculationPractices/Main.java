package CalculationPractices;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double amount , tax=0.18 , taxAmount ,withTaxAmount;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount you want to calculate :  ");
        amount =input.nextDouble();

        taxAmount = amount* tax;
        withTaxAmount = amount + taxAmount;

        System.out.println("amount = " + amount);
        System.out.println("tax = " + tax);
        System.out.println("taxAmount = " + taxAmount);
        System.out.println("withTaxAmount = " + withTaxAmount);



    }
}

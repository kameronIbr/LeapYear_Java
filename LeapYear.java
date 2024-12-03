// LeapYear.Java
// Kameron Ibraheem
// Lab02: LeapYear
//
//
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year greater than 100: "); //Prompts user to enter # greater than 100
        int year = scanner.nextInt();

        if (year <= 100) {
            System.out.println("Error"); //Prints an Error if number is 100 or less
        } else {
            if (year % 4 != 0) {
                System.out.println(year + " is not a leap year.");
            } else {
                if (year % 100 == 0) {
                    if (year % 400 != 0) {
                        System.out.println(year + " is not a leap year.");
                    } else {
                        System.out.println(year + " is a leap year.");
                    }
                } else {
                    System.out.println(year + " is a leap year.");
                }
            }
        }

    }
}



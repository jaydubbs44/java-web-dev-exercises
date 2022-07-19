package exercises;

import java.util.Scanner;

public class Mpg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven: ");
        double miles = input.nextDouble();
        System.out.println("How many gallons of gasoline have you used ");
        double gallons = input.nextDouble();
        double mpg = miles / gallons;
        input.close();
        System.out.println("Your miles per gallon, on average, are " + mpg + " miles per gallon");
    }
}

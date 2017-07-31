package main.java.ro.sci.tema5;

import java.util.Scanner;

/**
 * Created by Capone on 7/17/2017.
 *
 * 5. display all the prime numbers lower than a given number
 */
public class PrimeNumbers {
    public static void main(String[] args) {

        int number = 0;

        //get user input for the desired number
        System.out.println("Input a number please. We will display all the prime numbers lower than your number.");
        Scanner reader = new Scanner(System.in);

        //validate that input is a number
        if (reader.hasNextInt()) {
            number = reader.nextInt();
        } else {
            System.out.println("Please enter a number! No other chars allowed");
            main(args);
        }

        System.out.println("Prime numbers that are less than " + number + " are: ");

        //iterate through all the numbers that are less than 'n' (numbers)
        for (int j = 2; j <= number; j++) {
            if (isPrime(j))
                System.out.println(j);
        }
    }

    //calculate if a number is prime and return 'true' if so
    private static boolean isPrime(int m) {

        for (int i = 2; i < m; i++) {
            if (m % i == 0)
                return false;
        }
        return true;
    }
}



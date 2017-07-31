package main.java.ro.sci.tema3;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by florin.dobrean on 7/13/2017.
 *
 * 3. display the max digit from a number. -V2
 *

 */
public class MaxDigit2 {
    public static void main(String[] args) {

        int number = 0;

        //get user input for the desired number
        System.out.println("Input a number please. We will calculate the highest digit that this number contains");
        Scanner reader = new Scanner(System.in);

        //validate that input is a number
        if (reader.hasNextInt()) {
            number = reader.nextInt();
        } else {
            System.out.println("Please enter a number! No other chars allowed");
            main(args);
        }

        //print the number
        System.out.println("The number you entered is " + number);

        //get number length
        int numberLength = (int)(Math.log10(number)+1);

        //convert number to array
        String temp = Integer.toString(number);
        int[] newNumber = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            newNumber[i] = temp.charAt(i) - '0';
        }

        //print max value from number
        System.out.println("Max digit from above number is: " + getMaxValue(newNumber));

    }
    //get max value from number
    public static int getMaxValue(int[] newNumber){
        int maxValue = newNumber[0];
        for(int j=1;j<newNumber.length;j++){
            if(maxValue<newNumber[j])
                maxValue=newNumber[j];
        }
        return maxValue;
    }
}

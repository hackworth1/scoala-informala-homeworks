package main.java.ro.sci.tema2;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by florin.dobrean on 7/13/2017.
 *
 * 2. display the smallest number from an array of number
 *
 */
public class SmallestArrayNo {

    public static void main (String[] args) {

        //scan user input value and validate that it is a number
        int[] userNumbers = new int[5];
        System.out.println("Input 5 numbers please. We will calculate which is the lowest of these numbers.");
        Scanner reader = new Scanner(System.in);

        for (int i = 0; i < userNumbers.length; i++) {

            System.out.println("Input a number then press enter:");

            if(reader.hasNextInt()) {
                int n = reader.nextInt();
                userNumbers[i] = n;
            }
            else {
                System.out.println("Please enter a number! No other chars allowed");
                main(args);
            }
        }

        // print the number and the minimum digit from that number
        System.out.println("The numbers you entered are: " + Arrays.toString(userNumbers));
        System.out.println("The lowest number from the above list is: " + getMinValue(userNumbers));
    }

    //get the minimum digit from a number
    public static int getMinValue(int[] userNumbers) {
        int minValue = userNumbers[0];
        for(int j=1;j<userNumbers.length;j++){
            if(userNumbers[j]<minValue){
                minValue=userNumbers[j];
            }
        }
        return minValue;
    }
}

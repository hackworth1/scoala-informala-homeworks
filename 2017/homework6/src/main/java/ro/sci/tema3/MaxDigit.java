package main.java.ro.sci.tema3;
import java.util.Scanner;

/**
 * Created by florin.dobrean on 7/13/2017.
 *
 * 3. display the max digit from a number. V1
 *
 * Am un bug in cod, daca prima data se introduce altceva decat un int, atunci se reexecuta functia main de 2 ori (cred ca e problema la linia 26)
 * -
 */
public class MaxDigit {
    public static void main(String[] args) {

        int number = 0;

        System.out.println("Input a number please. We will calculate the highest digit that this number contains");
        Scanner reader = new Scanner(System.in);

        if(reader.hasNextInt()) {
            number = reader.nextInt();
        }
        else {
            System.out.println("Please enter a number! No other chars allowed");
            main(args); // aici cred ca ceva nu e ok !!!!
        }

        System.out.println("The number you entered is " + number);

        String numberString = Integer.toString(number);
        String[] numberArray = numberString.split("");
        int numberLength = numberArray.length;

        int[] numberArrayInt = new int[numberLength];

        for(int i=0;i<numberLength;i++){
            numberArrayInt[i] = Integer.parseInt(numberArray[i]);
        }

        System.out.println("Max digit from above number is: " + getMaxValue(numberArrayInt) );
    }
    public static int getMaxValue(int[] numberArrayInt){
        int maxValue = numberArrayInt[0];
        for(int j=1;j<numberArrayInt.length;j++){
            if(maxValue<numberArrayInt[j])
                maxValue=numberArrayInt[j];
        }
        return maxValue;
    }

}

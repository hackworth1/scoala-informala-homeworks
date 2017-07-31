package main.java.ro.sci.tema1;

/**
 * Created by florin.dobrean on 7/13/2017.
 *
 * 1. calculate the sum of the first 100 numbers higher than 0
 */
public class SumMain {
    public static void main (String[] args){

        int sum = 0;
        for (int i=1;i<=100;i++){
            sum = sum + i;
        }
        System.out.println("The sum of all numbers from 0 to 100 is: " + sum);
    }
}

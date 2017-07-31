package main.java.ro.sci.tema4;

import java.util.Scanner;

/**
 * Created by florin.dobrean on 7/14/2017.
 *
 * 4. check if a number is palindrom( e.g palindrom 1221, 34143)
 * Aici iar e problema cu call-ul de main function acolo(linia 25); de asemenea cred ca jos la linia 28, temp si temp2 sunt obiecte nu stringuri, si nu inteleg de ce
 */
public class Palindorm {
    public static void main(String[] args) {

        int number = 0;

        //get user input for the desired number
        System.out.println("Input a number please. We will see if this is a palindrom number or not.");
        Scanner reader = new Scanner(System.in);

        //validate that input is a number
        if (reader.hasNextInt()) {
            number = reader.nextInt();
        } else {
            System.out.println("Please enter a number! No other chars allowed");
            main(args);
        }

        //convert number to String
        String temp = Integer.toString(number);
        String temp2 = new StringBuilder(temp).reverse().toString();

        System.out.println("The numbers that are being compared are: " + temp + " and " + temp2);

        //compare the two numbers (* aici am impresia ca unul dintre numere e obiect, sau amandoua, desi ar trebui sa fie string)
        if(temp.equals(temp2) || (temp.length()== 0 || temp2.length() == 0 || temp.length()== 1 || temp2.length()== 1)){
            System.out.println("The number is palindrom.");
        }
        else System.out.println("The number is NOT palindrom.");
    }
}

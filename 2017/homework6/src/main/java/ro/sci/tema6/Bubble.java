package main.java.ro.sci.tema6;

import java.util.Arrays;

/**
 * Created by florin.dobrean on 7/31/2017.
 */

class SaleBoys {

    int sales;
    int quota;
    int rev = sales * quota; // <- asta nu e vazut in functia main.. ca nu as mai fi pus in fctia main rev=sales*quota..

}

public class Bubble {
    public static void main (String[] args) {

    SaleBoys seller1 = new SaleBoys();
    seller1.sales = 5;
    seller1.quota = 500;
    seller1.rev = seller1.sales * seller1.quota;

    SaleBoys seller2 = new SaleBoys();
    seller2.sales = 6;
    seller2.quota = 800;
    seller2.rev = seller2.sales * seller2.quota;

    SaleBoys seller3 = new SaleBoys();
    seller3.sales = 2;
    seller3.quota = 1000;
    seller3.rev = seller3.sales * seller3.quota;

    SaleBoys seller4 = new SaleBoys();
    seller4.sales = 7;
    seller4.quota = 300;
    seller4.rev = seller4.sales * seller4.quota;

    SaleBoys seller5 = new SaleBoys();
    seller5.sales = 11;
    seller5.quota = 1100;
    seller5.rev = seller5.sales * seller5.quota;

    //aici tre vazut care e treaba
    int allSale[] = new int[5];
    allSale[0] = seller1.rev;
    allSale[1] = seller2.rev;
    allSale[2] = seller3.rev;
    allSale[3] = seller4.rev;
    allSale[4] = seller5.rev;

    System.out.println("List in descending order is: " + Arrays.toString(sort(allSale)));
    }

    public static int[] sort(int[] allSale){
        int temp = 0;
        int[] result = new int[5];
        result = allSale;

        for (int j = 0; j < allSale.length - 1; j++) {
            for (int i = 0; i < allSale.length - 1; i++) {
                if (allSale[i] < allSale[i + 1]) {
                    temp = allSale[i];
                    result[i] = allSale[i + 1];
                    allSale[i + 1] = temp;
                }
            }
        }
    return result;
    }
}
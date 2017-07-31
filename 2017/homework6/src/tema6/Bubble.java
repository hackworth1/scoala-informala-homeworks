package tema6;

import java.util.Arrays;

/**
 * Created by florin.dobrean on 7/31/2017.
 */
public class Bubble {
    public static void main (String[] args) {

        int allSale[] = new int[5];
        allSale[0] = 5;
        allSale[1] = 4;
        allSale[2] = 9;
        allSale[3] = 2;
        allSale[4] = 1;
        int temp = 0;

        for (int j = 0; j < allSale.length - 1; j++) {
            for (int i = 0; i < allSale.length - 1; i++) {
                if (allSale[i] < allSale[i + 1]) {
                    temp = allSale[i];
                    allSale[i] = allSale[i + 1];
                    allSale[i + 1] = temp;
                }
            }
        }
        System.out.println("new array is " + Arrays.toString(allSale));
    }
}

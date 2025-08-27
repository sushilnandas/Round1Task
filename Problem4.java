package com;
import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        int[] arr = {1,2,8,9,12,46,76,82,15,20,30};

        // dictionary-like result (using array index 1..9)
        int[] count = new int[10]; 

        for (int k = 1; k <= 9; k++) {
            int c = 0;
            for (int num : arr) {
                if (num % k == 0) {
                    c++;
                }
            }
            count[k] = c;
        }

        // print result
        for (int k = 1; k <= 9; k++) {
            System.out.println(k + ": " + count[k]);
        }
    }
}

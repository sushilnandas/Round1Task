package com;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();
        int m = (a % 2 == 0) ? a - 1 : a;
         scanner.close();
        for (int i = 1; i <= m; i++) {
            System.out.print((2 * i - 1));
            if (i < m) {
                System.out.print(", ");
            }
        }
    }
}

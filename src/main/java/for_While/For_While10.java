package for_While;

import java.util.Scanner;

/*
        (ENG)   Write a Program to find the sum of natural numbers from 1 to 100.
        (TR)    1'den 100'e kadar olan doğal sayıların toplamını bulan programı yazınız.

        OUTPUT: Sum of Natural Numbers 5050
 */
public class For_While10 {
    public static void main(String[] args) {
        int sum=0;
        int i =1;
        while (i<=100){
            sum +=i;
            i++;
        }
        System.out.println("Solution with While Loop: "+sum);

        System.out.println("Sum of Natural Numbers: "+ex(100));
    }
    public static int ex (int a){
        int sum = (a*(a+1))/2;
        return sum;
    }
}

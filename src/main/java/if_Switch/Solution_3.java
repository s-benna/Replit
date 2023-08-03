package if_Switch;

import java.util.Scanner;
/*
Write a Java program that calculates and prints the sum of two given numbers (greater than or equal to zero).
If given integers or total more than 10 digits, print "OverFlow".

Example:
INPUT  :
25
46

OUTPUT :
Sum of Numbers: 71
 */
public class Solution_3 {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.print("Please write first number: ");
        long num1 = sc.nextLong();

        System.out.print("Please write second number: ");
        long num2 = sc.nextLong();

        long sum = num2+num1;
        long check = 1000000000L;

        if (num1>=check || num2>=check){
            System.out.println("OverFlow");
        }else {
            System.out.println("Sum: " + sum);
        }

    }
}

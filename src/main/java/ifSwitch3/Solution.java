package ifSwitch3;

import java.util.Scanner;

public class Solution {
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

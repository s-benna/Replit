package for_While;
/*
    (ENG)   Write a return method that accepts an integer as input and calculates factorial and prints like output.
    (TR)    Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.

Input : 6
Output: 6!=6*5*4*3*2*1=720

 */

import java.util.Scanner;

public class For_While04 {

    public static void main(String[] args) {
        System.out.println("Write number");
        Scanner input = new Scanner(System.in);
        long num = input.nextLong();
        long sonuc1= faktoriyel(num);
        System.out.println("Factorial of "+num+" is ==> "+sonuc1);

    }

    public static int faktoriyel(long a){

        if (a==0 || a==1){
            return 1;
        }

        long result =1;
        for (int i=1; i<a ; i++) {

            result *=i;

        }

        return (int) result;
    }

}

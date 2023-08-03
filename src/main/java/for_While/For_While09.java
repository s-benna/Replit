package for_While;

import java.util.Scanner;

/*
        (ENG)   Write a java program to reverse the number which user entered. (Interview Question)
        (TR)    Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)

        Input  :1238
        Output :Reverse Of The Number: 8321
 */
public class For_While09 {
    public static void main(String[] args) {

        int orignalnum=1238;
        int reversedNumber=reverseNumber(orignalnum);

        System.out.println("Original of number      : "+orignalnum);
        System.out.println("Reverse of the Number   : "+reversedNumber);

    }
    public static int reverseNumber(int num){
        int reversed =0;
        while (num!=0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return reversed;
    }


}

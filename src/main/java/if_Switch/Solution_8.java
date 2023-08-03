package if_Switch;

import java.util.Scanner;
/*
Ask the user to enter a name and print a new String
with 3 copies of the last 2 letters.

The name length received from the user will be at least 2.
INPUT  : Mustafa
OUTPUT : fafafa



Kullanıcıdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasından oluşan yeni bir String yazdırın

Kullanicidan alinan isim uzunluğu en az 2 olacaktır.
 */
public class Solution_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String namefirst = input.nextLine();

        //char n1 = namefirst.charAt(namefirst.length()-2);
        //char n2 = namefirst.charAt(namefirst.length()-1);
//
        //System.out.println(""+n1+n2+n1+n2+n1+n2);

        for (int i = namefirst.charAt(namefirst.length()-3);
                 i <namefirst.charAt(namefirst.length()-1) ;
                 i++) {
            System.out.println(""+i);
        }






    }
}

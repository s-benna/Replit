package if_Switch;

import java.util.Scanner;

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

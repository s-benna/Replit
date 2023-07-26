package ifSwitch6;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Isim giriniz");
        String name = inp.nextLine();

        String check = name.length()==3 && name.charAt(0)==name.charAt(1) &&
                name.charAt(1)==name.charAt(2) ?
                "Name has the same characters." : "String has unique characters";


        System.out.println(check);
    }
}

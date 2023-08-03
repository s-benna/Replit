package if_Switch;

import java.util.Scanner;
/*
Ask the user to type a name, the length of the name must be 3.
Then check if the name has the same characters.

If they have the same characters; "Name has the same characters." print it.

If they don't have the same characteristics; "Print "String has unique characters".

Use ternary.
 */
public class Solution_6 {
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

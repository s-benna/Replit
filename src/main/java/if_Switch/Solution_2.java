package if_Switch;

import java.util.Scanner;
/*
Write the java code that converts the user's Name, Surname and credit card numbers to the given format.

* Initial Letters must start with a capital letter.

Input :
Name  : John White
CCN   : 1234234534561478

Output :
Name : J*** W****
CCN  : **** **** **** 1478
 */
public class Solution_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Name and Surname.");
        String nameSurname = input.nextLine();

        System.out.println("Enter your Credit Card number.");
        String kartNo = input.nextLine();

        String [] names = nameSurname.split(" ");

        String firstName = names[0].substring(0, 1).toUpperCase() + names[0].substring(1);
        String lastName = names[1].substring(0, 1).toUpperCase() + names[1].substring(1);

        String lastFourDigits = kartNo.substring(kartNo.length() - 4);

        System.out.println("Name : " +firstName.charAt(0)+"***"+" "+lastName.charAt(0)+"***");
        System.out.println("CCN  : " +"**** **** ****"+lastFourDigits);
    }
}

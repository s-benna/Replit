package if_Switch;

import java.util.Scanner;
/*
Write a switch statement that tests the value of the char variable response and
does the following:

If the answer is a, The message "Your request is being processed" is printed.

If the answer is b, The message "thank you for your interest anyway" is printed.

If the answer is c, The message "Sorry, no help available at this time" is printed.

For any other response value, "Invalid login, please try again!" is printed.
 */
public class Solution_4 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter letters: ");
        String ch = inp.nextLine();

        switch (ch){
            case "a":
                System.out.println("Your request is being processed");
                break;
            case "b":
                System.out.println("Thank you for your interest anyway");
                break;
            case "c":
                System.out.println("Sorry, no help available at this time");
                break;
            default:
                System.out.println("Invalid login, please try again!");
                break;
        }
    }
}
